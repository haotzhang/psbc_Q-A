package com.example.psbc.service.impl;

import com.example.psbc.dto.KnowledgeDTO;
import com.example.psbc.entity.Knowledge;
import com.example.psbc.mapper.KnowledgeMapper;
import com.example.psbc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private KnowledgeMapper knowledgeMapper;

    @Override
    public Integer addKnowledge(KnowledgeDTO knowledgeDTO) {
        Knowledge knowledge = new Knowledge();
        knowledge.setQuestion(knowledgeDTO.getQuestion());
        knowledge.setAnswer(knowledgeDTO.getAnswer());

        knowledge.setAddTime(new Timestamp(new Date(System.currentTimeMillis()).getTime()));

        Long id = knowledgeMapper.getId();
        if(id != null){
            id++;
        }else{
            id=0L;
        }
        knowledge.setKnowledgeId(id);

        return knowledgeMapper.addOneKnowledge(knowledge);
    }

}
