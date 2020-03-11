class Op2{
	public static void main(String[] args){
		double d1=3.5, d2=2.0;
		
		/* int var1 = d1 + d2;
			이 형태로 입력하면 error발생
			그릇의 크기가 다르므로 물리적으로 불가능한 형태
			d1, d2는 8byte
			int는 4byte
			
			만약 억지로라도 써야하는 경우에는?
			강제로 형식을 바꿔버린다 ▼
			*/
		
		// 캐스팅 연산자 - 명시적
		
		//int var1 = (int)d1 + (int)d2;
		int var1 = (int)(d1 + d2); // 위에꺼랑 동일한 의미
		//(int) : 캐스팅 연산자, 명시적 연산자 
		//억지로 값을 입력하는 것이므로 d1의 0.5값은 날아가지만 어쩔수없다..
		java.lang.System.out.println("var1 = "+var1);
		
		
		// 캐스팅 연산자 - 묵시적
		
		//double d3 = (double)var1;
		double d3 = var1; //위에꺼랑 같은거 
		java.lang.System.out.println("d3 = "+ d3);	
		//작은 그릇은 큰그릇에 담을수 있기 때문에 캐스팅 연산자 묵시적으로 사용 가능하다
		
		
		byte b = (byte)var1; 
		/* 여기까지 var1은 double 8byte 
			byte 는 1byte이므로 
			명시적으로 표시해줘야함*/
		java.lang.System.out.println("b = "+ b);	
		
		
		b = 100;
		// 127까지 허용 가능하니 결과값 잘 출력된다
		/* b = b + 5;
			에러 뜸*/
		/* python에서는 주소를 저장하는 형식이여서 값이 크던말던 상관 안함
		   but, java는 진짜 값을 저장함 b라는 값이 실제로 100
				그렇기에 형태가 어떤지, 연산하는것이 까다로움
			그래서 에러가 왜 뜬다고?
				b=100 b에 값이 어디에 거쳐지지 않고 바로 저장됨
				but b= b+5는 연산이 되면서 
				임시 공간에 저장이 된다
				105라는 값이 저장된 메모리의 type은 무엇인가
				따로 형식이 지정되어 있지 않은 값은 default로 int(정수형)이 됨
			그러니까 b=b+5는 int형식
				형식이 맞지 않아 에러가 뜬다
				이럴때!! 캐스팅 연산자 - 명시적 사용해야함
			그리고(byte)5 이런 형태 불가함
				묶어서 한번에 표시해주자*/
				
		//정답1
		//b = (byte)(b + 5);
		
		//정답2
		b += 5;
		/*복합 연산자 +=
 		  java에서 저절로 형 전환되는 기능을 갖음*/
		java.lang.System.out.println("b = "+ b);	
		
		
		//float f = 3.14;
		/* 실수의 경우, 가수 3 소수 14 별도로 따로 저장하게 된다
		   3.14는 정수형(위의 5)와는 다르게 어떠한 값이 아니므로 
		   (float)3.14 로 써서 형 변환 가능*/
		
		//정답1
		//float f = (float)3.14;
		
		//정답2
		float f = 3.14f;
		/* 숫자뒤에 데이터 타입의 약자를 붙여줘도 
			데이터 형 변환 가능
			캐스팅 연산자 중 하나*/
		//f = f + 2.5f;
		//f = (float)(f+2.5);
		f += 2.5;
		/* 실수는 소수점 자리수를 적절하게 정리한 뒤 사용해야함
			그럼 그 정리는 어떻게 하는거지?*/
		java.lang.System.out.println("f = "+ f);	
		
		long var2 = 100;
		var2 = var2 + 1000;
		// long형식이 더 커 묵시적 캐스팅으로 문제없이 연산이 이루어짐 
		
		//var2 = 25000000000;
		/* 250억은 너무나도 큰 값이라서 error발생
		   근데 나중에 큰값 이용해야하면 어떡함...?
		   250억은 default로 int형이 됨
		   그렇기에 long형으로 바꿔줘야함
		   근데 250억은 정수형이라 (long)25000000000 형태로 못씀
		   그렇기에 250억 뒤에 long형 꼬리표 달아주자*/
		var2 = 25000000000L;
		java.lang.System.out.println("var2 = "+ var2);	
		
		int i = 'a';
		java.lang.System.out.println("i = "+ i);
		// ASCII 코드로 변환됨
		
		char c = 98;
		java.lang.System.out.println("c = "+ c);
		/*  ASCII 코드로 변환됨
			문자와 숫자값은 자동적으로 형변환됨*/
			
		System.out.println("\n\n\n");
		
		//삼항 연산자 
		int data = 10;
		char result = (data > 5) ? 'T' : 'F';
		System.out.println(result);
		
		
	}
}









