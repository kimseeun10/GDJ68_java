package com.iu.seeun1;

public class Study2 {
	public static void main(String [] args) {
		System.out.println("시작");
		/*
		 * 여러줄 주석
		 * 여기도 주석
		 * */
		
		/** 
		 * 문서작성시 주석
		 */
		
		int num1 = 20;
		int num2 = 50;
		int num3 = num1 + num2;
		
		String name = "1";
		String result= name + 2.1;
		
		int count = 78;
		//후행
		count++; // count=count+1;
		//선행
		++count; // count=count+1;
		
		int r = ++count + count++; 
		--count; // count=count-1;
		count--; // count=count-1;
		
		count=count+1;
		count+=1;
		count=count*5;
		count*=5;
		count=count%3;
		count%=3;
		
		System.out.println("Count : " + count);
		System.out.println("R : " + r);
		System.out.println(result);
		System.out.println("종료");
	}
}
