package com.iu.seeun1;

import java.util.Scanner;

public class Study4 {
	public static void main(String[] args) {
		//조건식? 조건식이 true : 조건식이 false;
		
		int age = 5;
		String result = age>19? "성년":"미성년";
		
		System.out.println(result);
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건의 합계를 입력");
		
		int price = sc.nextInt();
		
		//가격이 3만원 미만이면 배송비 3000원 추가, 아니면 무료

		int del = price < 30000? 3000:0;

		//가격이 3만원 미만이면 5% 할인, 아니면 10%할인, 단 배송비 제외
		
//		price = price < 30000? (int)(price*0.95)+del :(int)(price*0.9)+del;
//		price = price+del;
		double sale = price<30000? 0.95:0.9;
		
		price = (int)(price*sale) + del;
		
		System.out.println("최종 가격: " + price);
		
	}

}
