package com.yoramu.service;

import com.yoramu.model.Semester;

import java.util.List;

public interface SemesterService {

    Semester addSemester(Semester semester);
    List<Semester> semesterList();
    void deleteSemester(Semester semester);
    Semester findSemesterByName(String name);
}
