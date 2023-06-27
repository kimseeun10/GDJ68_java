package com.iu.seeun1;

public class Study3 {
	public static void main(String[] args) {
		
		//국어점수를 담을 변수
		//영어점수를 담을 변수
		//수학점수를 담을 변수
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		//총점을 담을 변수
		int total = kor + eng + math;
		
		double avr =0;
		
		kor = 37;
		eng = 30;
		math = 30;
		
		total = kor + eng + math;
		avr = total/3; //자동형변환됨
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avr);
		
		//자동형변환
		avr = (double)kor;
		
		//강제형변환
		eng = (int)avr;
		//String name = (String)avr; => String 형변환 사용불가
		
		long n1 = 0L;
		float f1 = 0.0F;
		
		f1 = n1; // float이 long보다 큰 값으로 취급됨 
	}

}
