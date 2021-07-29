package com.ae.ae2.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	
	//makeLotto 메서드명
	//1-45 6개 중복 x
	
	public int [] makeLotto(){
		
		int [] nums = new int[6];
		
		Random random = new Random();
		
		for(int i=0; i< nums.length; i++) {
			nums[i] = random.nextInt(46)+1; //0제거
			for(int j=0; j<i; j++) {
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		return nums;
		
	}
	
	
	public HashSet<Integer> makeLotto2() {
		HashSet<Integer> hashset = new HashSet<>();
		Random random = new Random();
		while(hashset.size()!=6) {
			int num = random.nextInt(45)+1; //0 제거
			hashset.add(num);
		}
		return hashset;
		
//		boolean check = hashset.add(1);
//		System.out.println(check);
//		check = hashset.add(1);
//		System.out.println(check);
//		System.out.println(hashset.size());
	}
	
	
	
	
	
	
	
	
//	public ArrayList<Integer> makeLotto() {
//		//1~45 6개 뽑기
//		//0 제외하기
//		ArrayList<Integer> ar = new ArrayList<>();
//		Random random = new Random();
//		for(int i=0; i<6; i++) {
//			int num = random.nextInt(45);
////			if(random.nextInt(46) ==0) { random.nextInt(45)+1 => 0이 나오면 1을 추가함
////				i--;
////				continue;
////			}ar.add(random.nextInt(46));
//			
//			if(random.nextInt(46) != 0) {
//				ar.add(num);
//			}
//		}
//		
//		
//		//List에 추가하고 리턴
//		
//		return ar;
//		
//	}
	
	
	
}
