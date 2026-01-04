package com.sms.ai.dto;

import java.time.LocalDate;

public record StudentDto(
        String studentId,
        String admissionNo,
        String name,
        String email,
        String phone,
        LocalDate dateOfBirth,
        String gender,
        Integer currentGrade,
        String schoolId,
        String fatherName,
        String motherName,
        String guardianName
) {}
