package com.iu.seeun4.s2;

public class StudentView {
	
	public void view(Student student) {
		
		System.out.println(student.getName());
		System.out.println(student.getNum());
		System.out.println(student.getAvg());
		
	}
	
	public void view(Student [] students) { //1번을 눌러 입력한 정보가 저장된 Students[] students를 호출
		
		for(int i=0; i<students.length; i++) { //학생수를 모르니까 1번에서 생성된 배열의 길이만큼 반복
			Student student = students[i];
//			System.out.println(student.name);
//			System.out.println(student.num);
//			System.out.println(students[i].avg);
			this.view(student); 
			System.out.println("------------------------------");
		}
		
	}
	
}				
