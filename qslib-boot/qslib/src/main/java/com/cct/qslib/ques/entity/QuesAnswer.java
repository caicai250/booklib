package com.cct.qslib.ques.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 答案表
 * </p>
 *
 * @author caic
 * @since 2024-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_QUES_ANSWER")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuesAnswer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 题干ID
     */
    private String quesMainId;

    /**
     * 所属选项组
     */
    private Integer optionGroup;

    /**
     * 答案
     */
    private String answer;


}
