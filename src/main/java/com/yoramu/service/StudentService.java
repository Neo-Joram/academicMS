package com.yoramu.service;

import com.yoramu.model.Student;

import java.util.List;

public interface StudentService {
    Student insertStudent(Student student);
    List<Student> studentList();
    void deleteStudent(Student student);
    Student findStudentByRegNo(String regNo);
}
