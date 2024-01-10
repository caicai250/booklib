package com.cct.qslib.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author caic
 * @since 2024-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_SYS_USER_ROLE")
public class TSysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**ID*/
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    /**用户ID*/
    private String userId;

    /**角色ID*/
    private String roleId;


}
