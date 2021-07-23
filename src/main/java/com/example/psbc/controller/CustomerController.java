package com.example.psbc.controller;

import com.example.psbc.service.CustomerService;
import com.example.psbc.vo.KnowledgeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("oneQuestion")
    public KnowledgeVO getQuestionById(Long id){
        return customerService.getOneQuestion(id);
    }

    @PostMapping("allQuestion")
    public ArrayList<KnowledgeVO> getAllQuestion(){
        return customerService.getAllQuestion();
    }


    @PostMapping("answer")
    public List<String> getAnswers(@RequestBody String question){
        return customerService.getAnswers(question);
    }


}
