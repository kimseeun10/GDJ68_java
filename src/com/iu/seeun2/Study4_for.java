package com.iu.seeun2;

import java.util.Iterator;
import java.util.Scanner;

public class Study4_for {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("hello");
		}
		
		int j = 567;
		for(j=0; j<3; j=j+1) {
			
		}
		// -----------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		// hello 출력
		// 키보드로부터 출력 횟수를 입력받음

		System.out.println("횟수를 입력하세요.");
		int count = sc.nextInt();
		for(int c = 0; c <count; c++) {
			System.out.println("Hello");
		}
		
		
		
	}
}
