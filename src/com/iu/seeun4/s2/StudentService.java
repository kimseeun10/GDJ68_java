package com.iu.seeun4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student makeStudentOne() {
		Scanner sc = new Scanner(System.in);
		//학생 한 명의 정보를 입력받아서 return해주기
		//학생 1명 만들어서 이름, 번호, 국어, 영어, 수학
		//총점 평균을 계산
		//학생을 리턴
		
		Student student = new Student();
		
		System.out.println("이름을 입력하세요.");
		student.name=sc.next();
		
		System.out.println("번호를 입력하세요.");
		student.num=sc.nextInt();
		
		System.out.println("국어 점수를 입력하세요.");
		student.kor=sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요.");
		student.eng=sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");
		student.math=sc.nextInt();
		
		student.total=student.kor+student.eng+student.math;
		student.avg=student.total/3.0;
		
		return student;
		
	}

	public Student [] makeStudents() {
		//학생수 입력
		//학생수 만큼 학생들이 만들어짐
		//이름, 번호, 국어, 영어, 수학 점수를 입력 (학생 한 명마다)
		//총점, 평균 계산 
		//학생들을 리턴
		//1. 학생 배열을 생성
		//2. 학생수만큼 반복문 실행
		//3. 반복문 내에서 이름,번호,국어,영어,수학 입력 총점 평균
		//4. 해당 학생을 배열에 대입
		Scanner sc = new Scanner(System.in);		
		System.out.println("학생수를 입력하세요.");
		int count = sc.nextInt();
		
		Student [] students = new Student[count]; 
			
		for(int i=0; i<count; i++) {
			Student student = new Student();
			
			System.out.println("이름을 입력하세요.");
			student.name=sc.next();
			
			System.out.println("번호를 입력하세요.");
			student.num=sc.nextInt();
			
			System.out.println("국어 점수를 입력하세요.");
			student.kor=sc.nextInt();
			
			System.out.println("영어 점수를 입력하세요.");
			student.eng=sc.nextInt();
			
			System.out.println("수학 점수를 입력하세요.");
			student.math=sc.nextInt();
			
			student.total=student.kor+student.eng+student.math;
			student.avg=student.total/3.0;
			
			students[i]=student;
		}
		return students;
	}
	
}
