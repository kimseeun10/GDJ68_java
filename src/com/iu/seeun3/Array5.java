package com.iu.seeun3;

import java.util.Iterator;
import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		//정수 5칸
		int [] nums = new int[6];
		Random random = new Random();
		
		for(int i=0; i<nums.length;i++) {
			nums[i]=random.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<6; j++) {
				if(nums[i]>nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}	
		
		
		
		}
		
	}

