package com.yoramu.service;

import com.yoramu.model.CourseDefinition;

import java.util.List;

public interface CourseDefinitionService {
    public CourseDefinition addCourseDefinition(CourseDefinition definition);
    public List<CourseDefinition> courseDefinitionList();
    public void deleteDefinition(CourseDefinition definition);
    public CourseDefinition findUnitByName(String name);
}
