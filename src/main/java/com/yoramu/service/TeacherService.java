package com.yoramu.service;

import com.yoramu.model.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher addTeacher(Teacher teacher);
    public List<Teacher> teacherList();
    public void deleteTeacher(Teacher teacher);
    public Teacher findTeacherByName(String name);
}
