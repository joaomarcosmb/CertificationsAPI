package com.joao.barroso.certificationsapi.modules.students.controllers;

import com.joao.barroso.certificationsapi.modules.students.dtos.VerifyHasCertificationDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("/verify-certification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        return "Student has certification";
    }
}
