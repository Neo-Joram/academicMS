package com.yoramu.dao;

import com.yoramu.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CourseDao extends JpaRepository<Course, UUID> {
    List<Course> findCourseByDepartmentIdAndSemesterId(UUID depId, UUID semId);
}
