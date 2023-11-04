package com.yoramu.dao;

import com.yoramu.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherDao extends JpaRepository<Teacher, UUID> {
    Teacher findTeacherByName(String name);
}
