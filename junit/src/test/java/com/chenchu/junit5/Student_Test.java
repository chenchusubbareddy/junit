package com.chenchu.junit5;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.chenchu.spring5Example.Student;
import com.chenchu.spring5Example.StudentInter;
@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
//@RunWith(SpringJUnit4ClassRunner.class)
class Student_Test {

	
	@Mock	
	StudentInter studentInter;
	
	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void getAllStudents() {
		when(studentInter.getAllStudents()).thenReturn(Arrays.asList(new Student(1,"sname1",1000)));
		System.out.println(studentInter.getAllStudents());
	}
	
}
