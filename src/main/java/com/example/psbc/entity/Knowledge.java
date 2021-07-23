package com.example.psbc.entity;


import lombok.Data;

import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "knowledge")
@Data
public class Knowledge {

    /**
     * 问题ID
     */
    private Long knowledgeId;

    /**
     * 问题
     */
    private String question;

    /**
     * 答案
     */
    private String answer;

    /**
     * 问题录入时间
     */
    private Timestamp addTime;



}
