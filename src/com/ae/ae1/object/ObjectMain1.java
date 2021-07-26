package com.ae.ae1.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		
		//메서드 내에서 객체 생성하는 방법
		//클래스명 참조변수명 = new 클래스 생성자();
		
		Object obj = new Object();
		
		//멤버변수, 멤버메서드 호출
		//참조변수명.메서드명([인자값]);
		
		int num = obj.hashCode();		
		//System.out.println(num);
		
		String str = obj.toString();
		//System.out.println(str);
		//System.out.println(obj);
		
		Object obj2 = new Object();
		
		
		boolean bn = obj.equals(obj2);
		//System.out.println(obj ==obj);  obj.equals의 뜻
		//System.out.println(bn);
		
		Test t1 = new Test();
		Test t2 = new Test();
		//System.out.println(t1 == t2);

		t1.num1 = 100;
		boolean check = t1.equals(t2);
		System.out.println(check);
		//System.out.println(t1.num1 == t2.num1);
		//System.out.println(t1.equals(t2)); //Object로부터 상속받은 것 --> true가 나올 수 있게 수정
		//각각의 멤버변수를 비교하는 코드로 바꾸기
		
		
		
		//t1.hashCode();
		//Object obj3 = t1;
		
	}

}
