package com.iu.seeun2;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Study4_for2 {
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
//		for (int dan = 2; dan < 10; dan++) {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//		}
	
		//종료할 분,초를 입력받아 해당 분,초가 되면 종료
		
		System.out.println("분 입력");
		int min = sc.nextInt();
		System.out.println("초 입력");
		int sec = sc.nextInt();
		boolean check = false;
		
		for (int m = 0; m < 6; m++) {
			for (int s = 0; s < 60; s++) {
				System.out.println(m+":"+s);
				if(min==m&&sec==s) {
					check=true;
					break;
				}
			}
		
			if(check) {
				break;
			}
		}
//		for (int i = 1; i < 10; i++) {
//			System.out.println(3+"*"+i+"="+3*i);
//		}
		
/*
 		for(int i=0; i<5; i++) {
			int num = random.nextInt(3); // 0~3 미만의 정수 한 개를 랜덤으로 추출
			
			switch(num) {
			case 0:
				System.out.println(num);
				i=5;
				break;
			case 1:
				System.out.println(num);
				break;
			default:
				System.out.println(num);
			}
		} 
*/
		System.out.println("프로그램 종료");
		
	}
}
