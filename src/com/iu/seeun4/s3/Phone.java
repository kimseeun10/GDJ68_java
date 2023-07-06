package com.iu.seeun4.s3;

public class Phone {
	
	/*
 	1. 멤버변수 선언과 동시에 초기화     	: 활용도 하
	2. 객체 생성 후 멤버변수에 값을 대입 	: 활용도 하
	3. 생성자에서 초기화               : 활용도 중
	4. instance block           : 활용도 하
	5. Getter / Setter 메서드      : 활용도 상
	
	실행순서
	1 -> 4 -> 3 ->2,5
	 */
	
	String company="APPLE"; //실행1
	String brand="IPHONE15";
	
	{
		//Instance 초기화 블럭 //실행2
		this.company = "LG";
		this.brand = "가로본능";
	}
	
	public Phone() { //실행3
		this.company = "SAMSUNG";
		this.brand = "S20";
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
	}
	
}
