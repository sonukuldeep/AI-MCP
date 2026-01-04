package com.sms.ai.service;

import com.sms.ai.dto.StudentDto;
import com.sms.ai.entity.Student;
import com.sms.ai.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentReadService {

    private final StudentRepository repository;

    public StudentReadService(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentDto getByAdmissionNo(String admissionNo) {
        return repository.findByAdmissionNo(admissionNo)
                .map(this::toDto)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    private StudentDto toDto(Student s) {
        return new StudentDto(
                s.getStudentId(),
                s.getAdmissionNo(),
                s.getName(),
                s.getEmail(),
                s.getPhone(),
                s.getDateOfBirth(),
                s.getGender(),
                s.getCurrentGrade(),
                String.valueOf(s.getSchoolId()),
                s.getFatherName(),
                s.getMotherName(),
                s.getGuardianName()
        );
    }
}

