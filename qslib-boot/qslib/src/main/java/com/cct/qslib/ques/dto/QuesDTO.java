/*
 *
 *
 * @author caic
 * @since 1.0
 */
package com.cct.qslib.ques.dto;

import com.cct.qslib.ques.entity.QuesAnswer;
import com.cct.qslib.ques.entity.QuesMain;
import com.cct.qslib.ques.entity.QuesOption;
import com.cct.qslib.ques.entity.QuesParse;
import lombok.Data;

import java.util.List;

/**
 * <p>试题dto
 *
 * @author caic
 * @Date 2024/1/25
 * @since 1.0
 */
@Data
public class QuesDTO extends QuesMain {
    List<QuesAnswer> quesAnswerList;
    List<QuesParse> quesParseList;
    List<List<QuesOption>> quesOptionList;
}
