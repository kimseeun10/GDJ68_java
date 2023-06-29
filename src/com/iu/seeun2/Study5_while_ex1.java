package com.iu.seeun2;

import java.util.Scanner;

public class Study5_while_ex1 {
	public static void main(String[] args) {
		
		//while 
		//1. 로그인 시도 2. 프로그램 종료 
		
//		while(check) {
//			System.out.println("1.로그인 2.종료");
//			int select=sc.nextInt();
//			if(select==1) {
//				System.out.println("ID 입력");
//				int yId = sc.nextInt();
//				System.out.println("PW 입력");
//				int yPw = sc.nextInt();
//				if(id==yId && pw==yPw) {
//					System.out.println("로그인 성공"); break;
//				}else {
//					System.out.println("로그인 실패");
//				}
//			}else {
//				break;
//			}
//		}//while 끝
		
//		System.out.println("프로그램 종료");		
		

		System.out.println("--------------------"); 	

		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check = true;
		
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
		
		// 최종 : 현재레벨, GOLD 출력
//		for(level = 1; level<15; level++) {
//			for(int m = 1; m<=level*3; m++) {
//				System.out.println("몬스터 "+m+"마리 사냥");
//			}System.out.println("축! "+(level+1)+"레벨");
//		}
//		
		
		while(check) {	
			System.out.println("1. 로그인 시도 2. 프로그램 종료");
			int choose = sc.nextInt(); 
			if(choose==1) {
				System.out.println("아이디를 입력하세요.");
				int yId = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int yPw = sc.nextInt();
					if(yId==id && yPw==pw) {
						System.out.println("로그인 성공");
			
			//로그인 성공했을 때만 진행
			//모든 몬스터의 경험치는 동일, 최대 레벨 15 , GOLD 0
			//최초 5레벨 1000G 10레벨 2000G 15레벨 3000G
			
			int level = 1;
			int gold = 0;
			boolean stay = true;
			
			System.out.println("----게임 접속----");
			
			while(stay) {	
			for(level=1; level<16; level++) {
				for(int m=1; m<=level*3; m++) {
					System.out.println(m+"마리 사냥성공");
				}
				System.out.println(level+"레벨 달성");
				if(level%5==0) {
					gold=gold+1000;
					System.out.println(gold+"G 획득");
				}
				System.out.println("1. 계속하기 2. 그만하기");
				int c = sc.nextInt();
				if(c==1) {
					System.out.println("현재레벨 : " + level +" GOLD : "+gold);
					}else {System.out.println("종료"); break;} 
							} break;
						}
					}
				}else {
					System.out.println("종료"); check=false; 
					
			}
		}
		
		System.out.println("--------------------");
				
	}
}
