package com.iu.seeun4.s3;

public class Car {

	String company; //생략되어있으면 접근지정자가 default
	String brand;
	public String color;
	int price;
	
	//생성자(Constructor)
	//접근지정자 클래스명과동일한이름(대소문자도 동일하게)([매개변수 선언]){}
	
	public Car() {
		//기본생성자 -> 멤버변수의 값을 초기화 할 때 많이 사용함
		
		this("A7"); //-> 생성자 속에서 또 다른 생성자를 호출할 때 사용 , 영역 내 젤 위에 위치해야함
		
//		this.company="AUDI";
//		this.color="WHITE";
//		this.price = 9985;
		
	}
	
	public Car(String brand) { //생성자 오버로딩
		this(brand, "WHITE");
//		this.company="AUDI";
//		this.brand=brand; //앞 brand는 멤버변수 뒤 brand는 매개변수
//		this.color="WHITE";
//		this.price = 9985;
	}
	
	public Car(String brand, String color) { 
		this(brand, color, 9985);
//		this.company="AUDI";
//		this.brand=brand; 
//		this.color=color;
//		this.price = 9985;
	}
	
	public Car(String brand, String color, int price) { 
		this.company="AUDI";
		this.brand=brand; 
		this.color=color;
		this.price = price;
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("price : "+this.price+"만원");
	}
	
	
	
}
