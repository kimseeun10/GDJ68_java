package com.iu.seeun4;

public class Soldier {

	String grade;
	int num;
	//Rifle rifle; // "rifle을 가지고있다" 고 표현
	int [] ar;
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);

	}
	
}
