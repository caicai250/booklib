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
 * 解析表
 * </p>
 *
 * @author caic
 * @since 2024-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_QUES_PARSE")
public class QuesParse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 题干ID
     */
    private String quesMainId;

    /**
     * 解析内容
     */
    private String parseContent;

    /**
     * 解析序号
     */
    private Integer parseOrder;


}
