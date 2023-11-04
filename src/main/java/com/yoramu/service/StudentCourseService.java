package com.yoramu.service;

import com.yoramu.model.StudentCourse;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentCourseService {
    public StudentCourse insertStudentCourse(StudentCourse course);
    public List<StudentCourse> studentCourseList();
    public void deleteStudentCourse(StudentCourse course);
    public List<StudentCourse> courseByStudentId(UUID id);
    public List<StudentCourse> studentByCourseAndSem(UUID crId, UUID semId);
}
