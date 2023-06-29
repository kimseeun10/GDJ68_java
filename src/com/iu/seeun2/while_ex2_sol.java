package com.iu.seeun2;

import java.util.Random;
import java.util.Scanner;

public class while_ex2_sol {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		//TRPG
//		int hp=40; // 유저의 hp
//		int monsterHp=60; // 몬스터의 HP
//		int monsterPower=40; //몬스터의 공격력
		int userHp = 40;
		int monsterHp = 60;
		//유저정보 : hp, 몬스터 정보 : hp
		//1.평타 2.스킬 3.HP회복 4.도망
		//평타 : 0~10 이하의 공격데미지
		//스킬 : 0~30 이하의 공격데미지(최대3번까지만)
		//회복 : 회복량 0~40까지 HP회복 / HP최대 40
		//도망 : 50%확률로 성공, 실패
		
		//monster
		//1 : 유저에게 0~40의 공격데미지
		
		boolean flag=true;
		int skillCount=3;
		
		while(flag) {
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				select = random.nextInt(11);
				monsterHp=monsterHp-select;
				System.out.println("몹에게 "+select+" 피해를 주었습니다.");
				if(monsterHp<1) {
					System.out.println("몹이 죽었습니다.");
					break;
				}
				
			}else if(select==2) {
				//스킬
				if(skillCount>0) {
					select = random.nextInt(31);
					monsterHp=monsterHp-select;
					System.out.println("몹에게 "+select+" 피해를 주었습니다.");
					if(monsterHp<1) {
						System.out.println("몹이 죽었습니다.");
						break;
					}
					skillCount--;
				}else {
					System.out.println("마나가 부족합니다.");
				}
			}else if(select==3) {
				//회복
				select = random.nextInt(41);
				userHp=userHp+select;
				if(userHp>40) {
					userHp=40;
				}
				System.out.println("HP를 회복했습니다.");
			}else {
				//도망
				select = random.nextInt(1001);
				if(select%2 != 0) {
					System.out.println("도망 성공");
					break;
				}else {
					System.out.println("도망 실패");
				}
			}//유저의 끝
			
			select=random.nextInt(41);
			userHp=userHp=select;
			System.out.println("유저에게 "+select+" 피해를 주었습니다.");
			if(userHp<1) {
				System.out.println("You Die");
			}
			
		}//while 메뉴 끝

	
	
	
	
	}
	
}
