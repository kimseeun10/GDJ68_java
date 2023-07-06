package com.iu.seeun4.s2;

public class Chef {
	
	String name;
	
	public void makeRamyun2(Ramyun [] ramyuns) {
		for (int i = 0; i < ramyuns.length; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title="진라면";
			ramyun.price=3000;
			ramyuns[i]=ramyun;
		}
	}
	
	public Ramyun[] makeRamyun(int count) {
//			리턴하려는 데이터 타입		
//		Ramyun ramyun = new Ramyun();
//		Ramyun ramyun2 = new Ramyun();
//		ramyun2 = ramyun;
//		ramyun2 = new Ramyun(); // 선언된 변수에 새로운 객체 
//		여기까지 객체3개 생성됨 힙영역에 라면객체 만들어 주소를 변수에 저장, 실제 쓸 수 있는 객체는 2개뿐
//		int num = 2;
//		num = 3; // 선언된 변수에 새로운 값
		
		Ramyun[]ramyuns = new Ramyun[count];
		
		for (int i = 0; i < count; i++) {
			Ramyun ramyun = new Ramyun(); 
			ramyuns[i]=ramyun;
			
			ramyun.title="진라면";
			ramyun.price=3000;
			
			System.out.println(ramyuns[i]);
			System.out.println(ramyun);
			
//			ramyun.title="진라면";
//			ramyun.price=3000;
//			ramyuns[i]=ramyun; 순서 상관x
		}
		count = 50;
		
		return ramyuns;
	}
	
	public void makekimbap() {
		
	}
	
}
