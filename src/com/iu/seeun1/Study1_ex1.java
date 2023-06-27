package com.iu.seeun1;

public class Study1_ex1 {
	
	public static void main(String [] args) {
		System.out.println("프로그램 시작");
		
		//자기정보를 변수에 담아서 출력
		// 이름, 나이, 키, 전화번호, 혈액형, 졸업학점

		String name = "김세은";
		int age = 26;
		double height = 200;
		String tel = "010-3547-4596";
		String blood ="A";
		double score = 4.5;
		
		System.out.println("당신의 이름은 " + name +"입니다.");
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		System.out.println(height);
		System.out.println(tel);
		System.out.println(blood);
		System.out.println(score);
		
		System.out.println("프로그램 종료");
	}
}
