package com.iu.seeun2;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		
		//if(조건식) {조건식이 true일때만 실행}
		
		//단일 if를 사용
		//국어, 영어, 수학 입력
		//총점과 평균을 계산
		//평균이 90점이상이면 A를 출력
		//평균이 80점이상이면 B를 출력
		//평균이 70점이상이면 C를 출력
		//평균이 60점이상이면 D를 출력
		//그외는 F를 출력
		
		/*Scanner sc = new Scanner(System.in);
		
		double avg =0;
		
		System.out.println("국어 성적 입력");
		int kor = sc.nextInt();
		System.out.println("영어 성적 입력");
		int eng = sc.nextInt();
		System.out.println("수학 성적 입력");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		avg = total/3;
		
		if (avg>=90) {System.out.println("A");}
		if (avg>= 80 && avg<90) {System.out.println("B");}
		if (avg>=70 && avg<80) {System.out.println("C");}
		if (avg>=60 && avg<70) {System.out.println("D");}
		if (avg<60) {System.out.println("F");}*/
		
		System.out.println("------------------------------------");
		
		double avg = 50.25;
		String result = "F";
		
		if (avg>=90) {
			result = "A";
//			System.out.println("A");
			}
		if (avg>= 80 && avg<90) {
			result = "B";
//			System.out.println("B");
			}
		if (avg>=70 && avg<80) {
			result = "C";
			System.out.println("C");
			}
		if (avg>=60 && avg<70) {
			result = "D";
			System.out.println("D");
			}
//		if (avg<60) {
//			result = "F";
//			System.out.println("F");
//			}
		
		System.out.println(result);
		
	}

}
