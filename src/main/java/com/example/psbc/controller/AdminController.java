package com.example.psbc.controller;


import com.example.psbc.dto.KnowledgeDTO;
import com.example.psbc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/admin/")
public class AdminController {
    
    @Autowired
    private AdminService adminService;

    @PostMapping("addOne")
    public Integer addQuestion(@RequestBody KnowledgeDTO knowledgeDTO){
        return adminService.addKnowledge(knowledgeDTO);
    }
}
