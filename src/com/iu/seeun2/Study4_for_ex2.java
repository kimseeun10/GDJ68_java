package com.iu.seeun2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id=1234;
		int pw=5678;
		boolean login = false;
		
		// 로그인 시도 최대 5번까지 
	
		for(int i=0; i<5; i++) {
			System.out.println("ID를 입력하세요");
			int yId = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int yPw=sc.nextInt();
			if(yId==id && yPw==pw) {
				System.out.println("로그인 성공");
				i=5;
				login = true;
			}else {
				System.out.println("ID 또는 PW가 틀렸습니다.");
			}
		}
		
		// 로그인 성공시 "급여계산" 출력
		
		if(login) {
			System.out.println("급여계산");
		}
		System.out.println("프로그램 종료");
	}
}
