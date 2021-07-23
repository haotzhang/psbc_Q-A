package com.example.psbc.service;

import com.example.psbc.vo.KnowledgeVO;

import java.util.ArrayList;
import java.util.List;

public interface CustomerService {

    KnowledgeVO getOneQuestion(Long id);

    ArrayList<KnowledgeVO> getAllQuestion();

    List<String> getAnswers(String question);

}
