package com.iu.seeun4.s2;

import java.util.Scanner;

public class S2Main {
	
	public static void main(String[] args) {

		StudentService sv = new StudentService();	
		Student student = sv.makeStudentOne();
		System.out.println(student.avg);
		
		Student student2 = sv.makeStudents();
		
		
		
	}
	
}
