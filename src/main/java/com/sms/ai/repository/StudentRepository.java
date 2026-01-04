package com.sms.ai.repository;

import com.sms.ai.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByAdmissionNo(String admissionNo);

    Optional<Student> findByStudentId(String studentId);

    List<Student> findBySchoolId(Integer schoolId);
}

