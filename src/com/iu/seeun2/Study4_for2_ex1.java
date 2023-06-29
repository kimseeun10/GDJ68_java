package com.iu.seeun2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//FPS
		//30발, 3탄창
		//M16, 2가지: 단발, 3점사
		
		//1.단발 2.점사
		//1번 탕 -> 30번 2번 타타탕 -> 10번
		//탄창 교환시 다시 선택
		
		// 탄창 3번 교환가능
//		for(int ch=0; ch<3; ch++) {
//		System.out.println("번호 선택 1.단발 2.점사");
//		int type = sc.nextInt();
//		switch (type) {
//		case 1:
//			// 단발 선택시 
//			for (int d = 1; d < 31; d++) {
//				System.out.println(d+"탕");
//			}			
//			break;
//		case 2:
//			// 점사 선택시
//			for (int j = 1; j <11; j++) {
//				System.out.println(j+"타타탕");
//			}
//			break;
//		default:System.out.println("잘못 선택했습니다.");
//			ch=4;
//			break;
//			}
//		}
//		
		for(int tan=0; tan<3; tan++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			int count=10;
			String sound = "타타탕";
			if(select==1) {
				count=30;
				sound="탕";
			}
//			else {
//				count=10;
//				sound="타타탕";
//			}
			for(int b=0; b<count; b++) {
				System.out.println(sound);
			}
		}
		
	}
}
