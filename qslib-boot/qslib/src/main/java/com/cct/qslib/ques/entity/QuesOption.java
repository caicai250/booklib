package com.cct.qslib.ques.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 选项表
 * </p>
 *
 * @author caic
 * @since 2024-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_QUES_OPTION")
public class QuesOption implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 选项ID
     */
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 题干ID
     */
    private String quesMainId;

    /**
     * 选项标号
     */
    private String optionTitle;

    /**
     * 选项内容
     */
    private String optionContent;

    /**
     * 是否正确答案
     */
    private Integer quesRight;

    /**
     * 选项组
     */
    private Integer optionGroup;


}
