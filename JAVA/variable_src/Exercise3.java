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
	//�����ڷ� �̾��������� ���������� ������ Ÿ���� �Է��ص� �ȴ�
	
	System.out.println("f="+f); 
	System.out.println("l="+l); 

	//Q4
	float f2 = 0.1f; 
	double d = 0.1; 
	boolean result = (float)d==f2; 
	
	System.out.println("result="+result); 
	
	/*
	������
	c=30 
	ch=C 	
	f=1.5 
	l=27000000000 
	result=true
	*/
	
	}
}