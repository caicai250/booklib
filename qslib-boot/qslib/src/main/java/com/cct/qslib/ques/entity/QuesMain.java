package com.cct.qslib.ques.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 题干表
 * </p>
 *
 * @author caic
 * @since 2024-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_QUES_MAIN")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuesMain implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 所属科目ID
     */
    private String subjectId;

    /**
     * 所属知识点id
     */
    private String knowledgeId;

    /**
     * 题目类型
     */
    private String quesType;

    /**
     * 题干HTML
     */
    private String tigenHtml;

    /**
     * 题干
     */
    private String tigen;

    /**
     * 题目来源id
     */
    private String quesSourceId;

    /**
     * 选项json
     */
    private String optionJson;

    /**
     * 题目说明
     */
    private String remark;

    /**
     * 题目状态
     */
    private String status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
