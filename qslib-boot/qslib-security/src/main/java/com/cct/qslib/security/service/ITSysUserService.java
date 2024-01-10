package com.cct.qslib.security.service;

import com.cct.qslib.security.entity.TSysPermission;
import com.cct.qslib.security.entity.TSysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author caic
 * @since 2024-01-10
 */
public interface ITSysUserService extends IService<TSysUser> {

    List<TSysPermission> getPermissionByLoginName(String loginName);
}
