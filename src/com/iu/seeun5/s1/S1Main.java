package com.iu.seeun5.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Worrier worrier = new Worrier();
		worrier.getItem();
		Magician magician = new Magician();
		magician.getItem();
		
		//worrier.axe.name
		Character character = magician; //magician 타입은 character 타입이다.
		
		magician.setMp(20);
		magician = (Magician)character; 
		//character에서 mp를 쓰려면 자식 타입으로 변환하여야 함
		magician.setMp(0);
		
		character = worrier;
		
		Character [] w = new Character[2];
		w[0]=worrier;
		w[1]=magician;
		
		worrier = (Worrier)w[0]; //무슨 타입이 0번 인덱스에 들어갈지 모르기 때문에 형변환을 시켜줘야 함
		magician = (Magician)w[1];
		
		//w[1].setMP(); => 불가능해서 타입 변환
		magician = (Magician)w[1];
		magician.setMp(20);
		
		//위↑는 자식을 먼저 만들어서 mp가 만들어진 상태였고 
		//지금↓은 캐릭터 타입만 만들어서 mp가 만들어지지 않은 상태라 character를 강제로 magician으로 변환해도 mp가 없어서 오류 발생
		//----------------------------------------------------
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
		
		
	}

}
