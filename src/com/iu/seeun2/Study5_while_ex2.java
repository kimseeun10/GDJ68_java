package com.iu.seeun2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		//TRPG
//		int hp=40; // 유저의 hp
//		int monsterHp=60; // 몬스터의 HP
//		int monsterPower=40; //몬스터의 공격력
		
		//유저정보 : hp, 몬스터 정보 : hp
		//1.평타 2.스킬 3.HP회복 4.도망
		//평타 : 0~10 미만의 공격데미지
		//스킬 : 0~30 미만의 공격데미지(최대3번까지만)
		//회복 : 회복량 0~40까지 HP회복 / HP최대 40
		//도망 : 50%확률로 성공, 실패
		
		//monster
		//1 : 유저에게 0~40의 공격데미지
		
		int userHp = 40;
		int monsterHp = 60;
		
		System.out.println("번호를 선택하세요.");
		
		boolean a = true;
		
		while(a) {
			System.out.println("1.평타 2.스킬 3.HP회복 4.도망");
			int skill = sc.nextInt();
		if(skill==1) {
			System.out.println(monsterHp = monsterHp - random.nextInt(10));
		}else if(skill==2) {
			System.out.println(monsterHp = monsterHp - random.nextInt(30));
			
		}else if(skill==3) {
			if(userHp+random.nextInt(40)>=40) {
				System.out.println("이미 최대채력입니다.");
			}else {
			System.out.println(userHp = userHp+random.nextInt(40));
			}
		}else if(skill==4){
			if(random.nextInt(2)==0) {
				System.out.println("도망실패");
				}else{System.out.println("도망성공");}
			} else{
				System.out.println("잘못된 입력");
			}
		}
//		{
//			System.out.println(userHp=userHp-random.nextInt(40));
//		}
		
	

	
		
	}

}
