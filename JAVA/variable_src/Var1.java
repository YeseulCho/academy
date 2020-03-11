class Var1{
	public static void main(String[] args){
		int a;
		a = 100;
		
		int b = 200;
		
		/*
		a = 100;
		a = "abc"
		a = 3.4
		a는 이미 int라고 type 지정했기에 다른 type은 a로 변수 설정 불가능
		*/
		
		byte c;
		c = 127;
		//c = 128;
		java.lang.System.out.println(c);
		// c=127 : 값 입력 잘됨
		// c=128 : byte는 -128 ~ 127까지 입력가능하기에 128 지정하면 에러뜸
		
		char d;
		d = '한';   // 문자일때, 한글자 이면 '' 사용 
		java.lang.System.out.println(d);
		
		boolean e;
		e = true; // boolean은 true, false만 입력 가능
		java.lang.System.out.println(e);
	
	}
}