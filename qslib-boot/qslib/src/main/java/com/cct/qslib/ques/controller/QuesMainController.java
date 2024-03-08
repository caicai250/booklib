package com.cct.qslib.ques.controller;


import com.cct.qslib.ques.dto.QuesDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * <p>
 * 题干表 前端控制器
 * </p>
 *
 * @author caic
 * @since 2024-01-25
 */
@RestController
@RequestMapping("/ques")
public class QuesMainController {
    @GetMapping("/getQuesById")
    public QuesDTO getQuesById() {
        QuesDTO quesDTO=new QuesDTO();
        quesDTO.setQuesAnswerList(new ArrayList<>());
        return quesDTO;
    }

}
