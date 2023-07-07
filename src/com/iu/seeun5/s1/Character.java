package com.iu.seeun5.s1;

public class Character {
	private int hp;
	private int damage;
	private int level;
	
	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public final void getItem() { // 상속받아도 override 하지 못하게 final
		System.out.println("아이템 줍기");
	}
	
//	public abstract void hit();
	
	public void hit() {} //추상메서드 아님
}
