package com.iu.seeun2;

import java.util.Scanner;

public class s {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check = true;
		
		System.out.println("1. 로그인 시도 2. 프로그램 종료");
		int choose = sc.nextInt(); 
		switch (choose) {
		case 1:
			System.out.println("로그인 시도");
			while(check) {
				System.out.println("아이디를 입력하세요");
				int yId = sc.nextInt();
				System.out.println("비밀번호를 입력하세요");
				int yPw = sc.nextInt();
				if(yId==id&&yPw==pw) {
					System.out.println("로그인 성공"); check=false;
					}else {System.out.println("로그인 재시도");}
			} 
		case 2:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
			break;
		}
	}

}
