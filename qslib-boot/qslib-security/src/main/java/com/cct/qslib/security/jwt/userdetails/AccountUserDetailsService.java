package com.cct.qslib.security.jwt.userdetails;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import com.cct.qslib.security.entity.TSysPermission;
import com.cct.qslib.security.entity.TSysUser;
import com.cct.qslib.security.service.ITSysUserService;
import com.cct.qslib.security.vo.AccountUser;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountUserDetailsService implements UserDetailsService {
    @Autowired
    private ITSysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        TSysUser user = sysUserService.getOne(Wrappers.<TSysUser>lambdaQuery().eq(TSysUser::getLoginName, loginName), true);
        if (user == null) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        return new AccountUser(user.getId(), user.getLoginName(), user.getPassword(), getUserAuthority(user.getLoginName()));
    }

    /**
     * 获取用户权限信息（角色、菜单权限）
     * @param loginName
     * @return
     */
    public List<GrantedAuthority> getUserAuthority(String loginName) {
        // 角色(比如ROLE_admin)，菜单操作权限(比如sys:user:list)
        // 角色必须以ROLE_开头，security在判断角色时会自动截取ROLE_
        List<TSysPermission> permissions = sysUserService.getPermissionByLoginName(loginName);
        // 比如ROLE_admin,ROLE_normal,sys:user:list,...
        String authority = "";
        if (CollectionUtils.isNotEmpty(permissions)) {
            List<String> urls = permissions.stream().map(TSysPermission::getUrl).collect(Collectors.toList());
            authority = StrUtil.join(",", urls);
        }
        return AuthorityUtils.commaSeparatedStringToAuthorityList(authority);
    }
}
