package com.iu.seeun2;

public class Study4_for_ex1 {

	public static void main(String[] args) {
		// 0~10미만의 숫자 중 짝수 만 출력
		
		for(int i=0; i<10; i++) {
			if(i%2==0){System.out.println(i);}
		}
		System.out.println("------------------------------");
		
		// 0~10미만의 숫자 중 짝수 만 출력
		//단, if문 사용x
		
//		for (int j = 0; j < 10; j++) {
//			{System.out.println(j); j++;}
//		}
		
		for (int j = 0; j < 10; j=j+2) {
			System.out.println(j);
		}
		System.out.println("------------------------------");
		// a-z 출력
		
		for (int a = 97; a < 123; a++) {
			System.out.println((char)a);
		}


	}

}
