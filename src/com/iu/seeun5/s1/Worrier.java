package com.iu.seeun5.s1;

public class Worrier extends Character {
	
	Axe axe; //전사가 가지고 있는 도끼를 의미 (포함관계)
	
	
	@Override
	public void hit() {
		// TODO Auto-generated method stub
		System.out.println("칼로 공격");
	}
	
}
