package com.yoramu.dao;

import com.yoramu.model.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseDefinitionDao extends JpaRepository<CourseDefinition, UUID> {
    CourseDefinition findCourseDefinitionByName(String name);
}
