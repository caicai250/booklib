package com.cct.qslib.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author caic
 * @since 2024-01-10
  */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_SYS_ROLE")
public class TSysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 角色id */
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    /** 角色名 */
    private String roleName;

    /** 角色状态 */
    private String status;

    /** 角色说明 */
    private String remark;

    /** 创建时间 */
    private LocalDateTime createTime;

    /** 更新时间 */
    private LocalDateTime updateTime;


}
