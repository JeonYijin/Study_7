package com.ae.ae2.token;

import java.util.StringTokenizer;

public class TokenMain3 {

	public static void main(String[] args) {
		
		String str1 = "korea-usa-france"; //split
		String [] s = str1.split("-");
		Nation [] nations = new Nation[3];
		for(int i=0; i<s.length; i++) {
			Nation n = new Nation();
			n.setName(s[i]);
			nations[i] = n;
		}
		StringTokenizer st = new StringTokenizer(str1, "-");
		int i=0;
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			Nation n = new Nation();
			n.setName(name);
			nations[i] = n;
			i++;
		}
		

		String str2 = "note10-100-ipone12-130-zflip-300";//tokenizer
		
		//split 하나의 데이터를 하나의 객체에 들어가야 할 때
//		String [] strs = str2.split("-");
//		
//		for(int i=0; i<strs.length; i++) {
//			Phone phone = new Phone();
//			phone.setName(strs[i]);
//			phone.setPrice(strs[++i]);
//			
//		}
		
		//tokenizer 여러 개의 데이터가 하나의 객체에 들어가야 할 때 
		StringTokenizer st2 = new StringTokenizer(str2, "-");
		while(st2.hasMoreTokens()) {
			Phone phone = new Phone();
			phone.setName(st.nextToken());//nextToken 할때마다 자름 --> 잘라야하는것이 여러개일 때 Tokenizer가 편함
			phone.setPrice(st2.nextToken());
		}
		
		
		
	}

}
