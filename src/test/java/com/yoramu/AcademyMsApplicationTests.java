package com.yoramu;

import com.yoramu.model.Semester;
import com.yoramu.model.StudentRegistration;
import com.yoramu.service.SemesterService;
import com.yoramu.service.StudentRegistrationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AcademyMsApplicationTests {

	@Autowired
	SemesterService service;
	@Autowired
	StudentRegistrationService registrationService;

	@Test
	void contextLoads() {
	}

	@Test
	void findSemesters(){
		List<Semester> semesterList = service.semesterList();
		assertNotNull(semesterList);
	}

	@Test
	void findBySem(){
		List<Semester> semesterList = service.semesterList();
		List<StudentRegistration> registrationList = new ArrayList<>();
		for (Semester sem:
			 semesterList) {
			registrationList = registrationService.getStudentBySemesterId(sem.getId());
		}
		System.out.println(registrationList);
		assertNotNull(registrationList);
	}
}
