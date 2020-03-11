class Op1{
	public static void main(String[] args){
		int num1 = 10;
		
		//1씩 증가시키는 방법
		
		//변수 1개 사용시
		num1 = num1 + 1;
		java.lang.System.out.println(num1);
		
		num1++;
		java.lang.System.out.println(num1);
		
		++num1;
		java.lang.System.out.println(num1);
			//변수 하나만 쓸 때는 ++을 앞에 쓰던 뒤에 쓰던 상관없다
		
		// 변수 2개 사용시 : 되도록이면 코드 복잡하게 짜지말자 
		int num2 = 10, num3 = 0;
		num3 = ++num2;
		java.lang.System.out.println("num2 :" + num2 + ", num3 : " + num3);
			/* num2의 값을 먼저 증가시킴
			   그렇기에 num3도 증가된 값을 입력받음*/
		
		int n2 = 10, n3 = 0;
		n3 = n2++;
		java.lang.System.out.println("n2 :" + n2 + ", n3 : " + n3);
			/* 우선순위에 의해 n2의 값을 n3에 먼저 할당시킴
			   그 후에 n2의 값이 증가하게 된다*/
	}
}