package com.yoramu.dao;

import com.yoramu.model.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface StudentRegistrationDao extends JpaRepository<StudentRegistration, UUID> {
    List<StudentRegistration> findStudentRegistrationBySemesterId(UUID semester_id);
    List<StudentRegistration> findStudentRegistrationBySemesterIdAndUnitId(UUID semId, UUID unitId);
}
