package com.iu.seeun4.s5;

public class StaticTest {
	
	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		//this사용가능
		StaticTest.staticNum=50;
		instanceNum=20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		StaticTest.staticNum=20;
		//인스턴스 메서드 호출 불가 instanceMethod();(x)
		//객체를 안만들어서 this.사용불가, instanceNum=50;(x)
		//instanceNum사용불가(instanceNum은 객체가 만들어질 때 생성되기 때문, 무조건 있는 변수 아님)
		System.out.println("클래스메서드");
	}
	
}
