package com.yoramu.service;

import com.yoramu.model.Student;

import java.util.List;

public interface StudentService {
    public Student insertStudent(Student student);
    public List<Student> studentList();
    public void deleteStudent(Student student);
    public Student findStudentByRegNo(String regNo);
}
