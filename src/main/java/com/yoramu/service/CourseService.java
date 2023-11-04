package com.yoramu.service;

import com.yoramu.model.Course;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CourseService {
    public Course insertCourse(Course course);
    public List<Course> courseList();
    public void deleteCourse(Course course);
    public Optional<Course> courseById(UUID id);
    public Course courseByDefinitionId(UUID id);
    public List<Course> courseByDepAndSem(UUID depId, UUID semId);
}
