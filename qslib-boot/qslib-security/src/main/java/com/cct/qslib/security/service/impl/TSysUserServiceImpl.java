package com.cct.qslib.security.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cct.qslib.security.entity.TSysPermission;
import com.cct.qslib.security.entity.TSysRolePermission;
import com.cct.qslib.security.entity.TSysUser;
import com.cct.qslib.security.entity.TSysUserRole;
import com.cct.qslib.security.mapper.TSysUserMapper;
import com.cct.qslib.security.service.ITSysPermissionService;
import com.cct.qslib.security.service.ITSysRolePermissionService;
import com.cct.qslib.security.service.ITSysUserRoleService;
import com.cct.qslib.security.service.ITSysUserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author caic
 * @since 2024-01-10
 */
@Service
public class TSysUserServiceImpl extends ServiceImpl<TSysUserMapper, TSysUser> implements ITSysUserService {

    @Autowired
    private ITSysUserRoleService userRoleService;
    @Autowired
    private ITSysRolePermissionService rolePermissionService;
    @Autowired
    private ITSysPermissionService permissionService;

    @Override
    public List<TSysPermission> getPermissionByLoginName(String loginName) {
        TSysUser user = super.getOne(Wrappers.<TSysUser>lambdaQuery().eq(TSysUser::getLoginName, loginName), true);
        return this.getPermissionByUser(user);
    }

    public List<TSysPermission> getPermissionByUserId(String userId) {
        TSysUser user = super.getById(userId);
        return this.getPermissionByUser(user);
    }

    public List< TSysPermission> getPermissionByUser(TSysUser user) {
        List< TSysPermission> permissions = new ArrayList<>();
        if (null != user) {
            List<TSysUserRole> userRoles = userRoleService.list(Wrappers.<TSysUserRole>lambdaQuery().eq(TSysUserRole::getUserId, user.getId()));
            if (CollectionUtils.isNotEmpty(userRoles)) {
                List<String> roleIds = new ArrayList<>();
                userRoles.stream().forEach(userRole -> {
                    roleIds.add(userRole.getRoleId());
                });
                List<TSysRolePermission> rolePermissions = rolePermissionService.list(Wrappers.<TSysRolePermission>lambdaQuery().in(TSysRolePermission::getRoleId, roleIds));
                if (CollectionUtils.isNotEmpty(rolePermissions)) {
                    List<String> permissionIds = new ArrayList<>();
                    rolePermissions.stream().forEach(rolePermission -> {
                        permissionIds.add(rolePermission.getPermissionId());
                    });
                    permissions = permissionService.list(Wrappers.<TSysPermission>lambdaQuery().in(TSysPermission::getId, permissionIds));
                }
            }
        }
        return permissions;
    }



}
