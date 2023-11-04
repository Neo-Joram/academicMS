package com.yoramu.dao;

import com.yoramu.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentDao extends JpaRepository<Student, UUID> {
    Student findStudentByRegNo(String regNo);
}
