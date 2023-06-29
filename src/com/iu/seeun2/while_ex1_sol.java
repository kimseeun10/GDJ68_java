package com.iu.seeun2;

import java.util.Random;
import java.util.Scanner;

public class while_ex1_sol {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int id=1234;
		int pw=5678;
		boolean check = true;
		
		//while 
		//1. 로그인 시도 2. 프로그램 종료 
		
		while(check) {
			System.out.println("1.로그인 2.종료");
			int select=sc.nextInt();
			if(select==1) {
				System.out.println("ID 입력");
				int yId = sc.nextInt();
				System.out.println("PW 입력");
				int yPw = sc.nextInt();
				if(id==yId && pw==yPw) {
					System.out.println("로그인 성공"); 
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				check = false;
				break;
			}
		}//while 끝
		
		System.out.println("프로그램 종료");	
		
		if(check) {
		//로그인 성공했을 때만 진행
				//MMORPG
				//시작레벨:1
				//모든 몬스터의 경험치는 동일
				//최대레벨:15
				//GOLD : 0
				//5렙 달성시 1000G 지급
				//10렙 달성시 2000G 지급
				//15렙 달성시 3000G 지급 (총 6000G)
				//1렙 -> 2렙 : 3마리 (사냥성공) 
				//2렙 -> 3렙 : 6마리
				//3렙 -> 4렙 : 9마리
				//4렙 -> 5렙 : 12마리
				//...
				//14렙 -> 15렙 : 42마리
				//렙업시 게입을 계속할지, 종료할지 선택
		
		int level=1;
		int gold=0;
		
		for(level=1; level<15; level++) {
			
			if(level%5==0) {
				System.out.println(level+"렙 달성 축하합니다");
				gold = gold+level/5*1000;
			}
//			if(level==10) {
//				System.out.println("10렙 달성 축하합니다");
//				gold = gold+2000;
//			}
			
			//렙업시 게임을 계속할지 종료할 지 선택
			System.out.println("1. 사냥시작 2. 게임종료");
			int select=sc.nextInt();
			if(select != 1) {
				break;
			}
			
			for(int monster=0;monster<level*3;monster++) {
				System.out.println(monster+1+"마리 사냥성공");
			}
			System.out.println(level+1+ "로 렙업했습니다.");
		}//레벨업 과정
		if(level==15) {
			gold = gold+3000;
		}
		//현재 레벨, 골드 출력
		
		System.out.println("현재 레벨 : " + level);
		System.out.println("현재 골드 : " + gold);
		}
		
		System.out.println("프로그램 종료");
	}
	
}
