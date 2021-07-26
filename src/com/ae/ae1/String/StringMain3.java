package com.ae.ae1.String;

public class StringMain3 {

	public static void main(String[] args) {
		
		String name = "Hello world";
		char ch = 'l';
		//'o' 문자가 몇개 있는지?
		int count = 0;
		int num =0;
		
//		num = name.indexOf("o")      //내가 찾고싶은 문자를 입력하면 해당 인덱스를 알려줌
//		System.out.println(num);     // 없으면 -1이 나옴, 대소문자 구분함

		boolean flag = true;
		while(flag) {
			num = name.indexOf(ch, num); 
			if(num>0) {
				num+=1;	
				count = count+1;
			}else {
				System.out.println("검색을 종료");
				break;
			}
		}
		System.out.println(ch+" 는 총 "+count+" 개 있습니다.");
		
		for(int i=0; i<name.length(); i++) {
			num = name.indexOf(ch, num);
			if(num>0) {
				num+=1;
				count +=1;
			}else {
				System.out.println("종료");
				break;
			}
		}System.out.println(ch+" 는 총 "+count+" 개 있습니다.");
		
		name = "";
		name = new String();
		

		
	}

}
