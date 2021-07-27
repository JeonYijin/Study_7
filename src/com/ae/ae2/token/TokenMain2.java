package com.ae.ae2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		
		String str = "Korea-USA-china*france*UK-canada-geramany";
		
		str = str.replace('*', '-');
		System.out.println(str);
		
		//나라별로 파싱
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken().trim();
			System.out.println(s.toUpperCase());
		}
		
		//모든 나라이름은 대문자로 출력
		
		
	}

}
