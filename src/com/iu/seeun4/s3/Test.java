package com.iu.seeun4.s3;

public class Test {

	int num1; // heap영역에 생성 /멤버변수
	double num2;
	//메서드 오버로딩 
	public void hap() {
		
	}
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void hap(int n1, float n2) { 
		System.out.println(n1+n2);
	}
	public void hap(int n1 ,int n2, int n3) {
		System.out.println(n1+n2+n3);
	}

	
	public void hap(int num1) { //stack영역에 생성 / 지역변수(멤버변수보다 지역변수의 우선순위가 더 높아서 this필요) 
		System.out.println(this.num1+num1);
	}
	
	public boolean same(Test t) {
		//num1 과 다른 객체의 num1이 같고
		//num2 와 다른 객체의 num2가 같으면 true리턴, 아니면 false리턴
		boolean result = false;
		if(this.num1==t.num1 && this.num2==t.num2) {
		//t.num1 => test2에 있는 num1 / this.num1 => test1에 있는 num1
			result=true;
		}
		
		return result;
	}
	
	public void method1() {
		//참조변수명(객체를 만들기 전 클래스를 선언하고 사용하기 전에 생김).멤버변수명
		System.out.println(this.num1 + num2); 
		//this. -> 참조변수 this (자동으로 만들어짐/객체클래스 내에서만 사용가능) this에 시작점 주소가 담긴다고 생각해도 됨 
		//생략가능
		System.out.println(this);
		method2();
		this.method2();
	}
	
	public void method2() {
		System.out.println("method2");
	}
	
}
