package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.aurionpro.model.IStudentService;
import com.aurionpro.model.Student;

public class StudentTest {

	IStudentService studentService;
	Student student;

	@BeforeEach
	void inti() {
		studentService = Mockito.mock(IStudentService.class);
		student = new Student(studentService);
	}

	@Test
	void testCalculatePercentage() {
		Mockito.when(studentService.getMarks()).thenReturn((double) 650.0);
		Mockito.when(studentService.getNumberSubjects()).thenReturn(10);
		assertEquals(65, student.calculatePercentage());
	}

}
