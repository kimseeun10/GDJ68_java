package com.iu.seeun4.s5;

public class S5Main {

	public static void main(String[] args) {
		//static
//		StaticTest st = new StaticTest();
//		st.instanceNum=50;
		//클래스명.클래스변수명 (참조변수가 따로 없기 때문에)
		StaticTest.staticNum=20;
		//클래스명.메서드명();
//		StaticTest.staticMethod();
		
		MyCar.company="Kia";
		
		MyCar myCar = new MyCar();
		myCar.brand="A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand="SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
		
	}

}
