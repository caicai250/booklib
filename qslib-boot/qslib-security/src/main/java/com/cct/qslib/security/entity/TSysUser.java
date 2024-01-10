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
 * 用户表
 * </p>
 *
 * @author caic
 * @since 2024-01-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_SYS_USER")
public class TSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**用户id*/
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    /**登录名*/
    private String loginName;

    /**密码*/
    private String password;

    /**昵称*/
    private String nickName;

    /**用户姓名*/
    private String userName;

    /**身份证号*/
    private String cardId;

    /**手机号*/
    private String phone;

    /**邮箱*/
    private String eMail;

    /**微信号*/
    private String userWx;

    /**头像路径*/
    private String photoPath;

    /**用户状态*/
    private String status;

    /**创建时间*/
    private LocalDateTime createTime;

    /**更新时间*/
    private LocalDateTime updateTime;


}
