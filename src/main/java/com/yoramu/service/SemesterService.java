package com.yoramu.service;

import com.yoramu.model.Semester;

import java.util.List;

public interface SemesterService {

    public Semester addSemester(Semester semester);
    public List<Semester> semesterList();
    public void deleteSemester(Semester semester);
    public Semester findSemesterByName(String name);
}
