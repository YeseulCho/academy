class Var1{
	public static void main(String[] args){
		int a;
		a = 100;
		
		int b = 200;
		
		/*
		a = 100;
		a = "abc"
		a = 3.4
		a�� �̹� int��� type �����߱⿡ �ٸ� type�� a�� ���� ���� �Ұ���
		*/
		
		byte c;
		c = 127;
		//c = 128;
		java.lang.System.out.println(c);
		// c=127 : �� �Է� �ߵ�
		// c=128 : byte�� -128 ~ 127���� �Է°����ϱ⿡ 128 �����ϸ� ������
		
		char d;
		d = '��';   // �����϶�, �ѱ��� �̸� '' ��� 
		java.lang.System.out.println(d);
		
		boolean e;
		e = true; // boolean�� true, false�� �Է� ����
		java.lang.System.out.println(e);
	
	}
}