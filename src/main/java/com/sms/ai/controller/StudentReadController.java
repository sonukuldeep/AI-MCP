package com.sms.ai.controller;

import com.sms.ai.dto.StudentDto;
import com.sms.ai.service.StudentReadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentReadController {

    private final StudentReadService service;

    public StudentReadController(StudentReadService service) {
        this.service = service;
    }

    @GetMapping("/admission/{admissionNo}")
    public StudentDto getByAdmissionNo(@PathVariable String admissionNo) {
        return service.getByAdmissionNo(admissionNo);
    }
}

