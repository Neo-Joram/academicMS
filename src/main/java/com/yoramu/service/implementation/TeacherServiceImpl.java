package com.yoramu.service.implementation;

import com.yoramu.dao.TeacherDao;
import com.yoramu.model.Teacher;
import com.yoramu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDao teacherDao;

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    @Override
    public List<Teacher> teacherList() {
        return teacherDao.findAll();
    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        teacherDao.delete(teacher);
    }

    @Override
    public Teacher findTeacherByName(String name) {
        return teacherDao.findTeacherByName(name);
    }
}
