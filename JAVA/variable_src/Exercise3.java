class Exercise3 { 
	public static void main(String[] args) { 
	
	//Q1
	byte a = 10; 
	byte b = 20; 
	byte c = (byte)(a + b); 
	
	System.out.println("c="+c); 

	//Q2
	char ch = 'A'; 
	ch = (char)(ch + 2); 

	System.out.println("ch="+ch); 
	
	//Q3
	float f = 3 / 2f; 
	long l = 3000 * 3000 * 3000l; 
	//연산자로 이어져있으면 마지막에만 데이터 타입을 입력해도 된다
	
	System.out.println("f="+f); 
	System.out.println("l="+l); 

	//Q4
	float f2 = 0.1f; 
	double d = 0.1; 
	boolean result = (float)d==f2; 
	
	System.out.println("result="+result); 
	
	/*
	실행결과
	c=30 
	ch=C 	
	f=1.5 
	l=27000000000 
	result=true
	*/
	
	}
}