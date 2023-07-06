package com.iu.seeun4.s2;

import java.util.Scanner;

public class StudentController {

		public void start() {
			//1. 학생정보 생성 => makeStudents 호출
			//2. 학생정보 출력 => Student View에서 출력
			//3.프로그램 종료 
			//1번누르고 학생정보 만들고 다시 메뉴 나오고 2번누르면 학생정보 나오고 다시 메뉴 .. 종료를 누를 때까지 반복(while)
			Scanner sc = new Scanner(System.in);
			
			int select = 0;
			StudentService studentService = new StudentService();
			StudentView studentView = new StudentView();
			Student [] students = null;
			
			while(true){
			
				System.out.println("1.학생정보생성");
				System.out.println("2.학생정보출력");
				System.out.println("3.학생정보검색"); //학생 한명을 출력 
				System.out.println("4.프로그램종료");
				
				select = sc.nextInt();
				
				
				if(select==1) {
					students = studentService.makeStudents(); // students 는 Student[]을 의미
					//makeStudents가 실행되어 작성된 내용이 Students[]에 저장
				}else if(select==2) {
					studentView.view(students); //1번 안하고 2번부터 누르면 오류발생함
				}else if(select==3){
					//1.findByNum호출
					Student student = studentService.findByNum(students);
					//2.viewOne으로 보내기
					studentView.view(student);
				}else {
					System.out.println("종료합니다.");
					break;
				}
			}  
		}
}
