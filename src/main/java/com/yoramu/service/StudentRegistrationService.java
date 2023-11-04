package com.yoramu.service;

import com.yoramu.model.Semester;
import com.yoramu.model.StudentRegistration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentRegistrationService {
    public StudentRegistration createStudentRegistration(StudentRegistration registration);
    public List<StudentRegistration> registrationList();
    public void deleteStudentRegistration(StudentRegistration registration);
    public Optional<StudentRegistration> studRegistrationById(UUID id);

    List<StudentRegistration> getStudentBySemesterId(UUID id);

    public List<StudentRegistration> getStudentBySemesterAndDepartment(UUID id, UUID unitId);
}
