package com.iu.seeun1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Study2_ex2 {
	public static void main(String[] args) {
		System.out.println("start");
		int num = 10;
		Scanner sc = new Scanner(System.in);
		String name="test";
		
		//입력    출력
	 	// 0     0
		// 1     1
		// 2     2
		// 3     3
		// 4     4
		// 5     11
		// 6     12
		// 8     20
		// 9     21
		// 10    22
		// 16    40
	    // 19    43
		// 20    50
		// 400   1000
	
		System.out.println("입력하세요");
		int input = sc.nextInt();
	
		Calendar ca;
		
		ArrayList<Integer> ar;
		
		int output = input/4*10+input%4;
		
		System.out.println("Input : " + input + ", Output : " + output);
		
		System.out.println("finish");
	
	}

}
