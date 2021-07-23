package com.example.psbc.service.impl;

import com.example.psbc.mapper.KnowledgeMapper;
import com.example.psbc.service.CustomerService;
import com.example.psbc.vo.KnowledgeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private KnowledgeMapper knowledgeMapper;

    @Override
    public KnowledgeVO getOneQuestion(Long id) {
        return knowledgeMapper.getQuestionById(id);
    }

    @Override
    public ArrayList<KnowledgeVO> getAllQuestion() {
        return knowledgeMapper.getAllQuestion();
    }

    @Override
    public List<String> getAnswers(String question) {

        System.out.println(question);

        return null;

    }
}
