package com.sms.ai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Table(name = "student_school_master")
@Getter
public class Student {

    @Id
    @Column(name = "ssm_id")
    private Integer id;

    @Column(name = "ssm_student_id")
    private String studentId;

    @Column(name = "ssm_admission_no")
    private String admissionNo;

    @Column(name = "ssm_name")
    private String name;

    @Column(name = "ssm_email")
    private String email;

    @Column(name = "ssm_phone")
    private String phone;

    @Column(name = "ssm_date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "ssm_gender")
    private String gender;

    @Column(name = "ssm_current_grade")
    private Integer currentGrade;

    @Column(name = "ssm_school_id")
    private Integer schoolId;

    @Column(name = "ssm_father_name")
    private String fatherName;

    @Column(name = "ssm_mother_name")
    private String motherName;

    @Column(name = "ssm_guardian_name")
    private String guardianName;
}

