class Op2{
	public static void main(String[] args){
		double d1=3.5, d2=2.0;
		
		/* int var1 = d1 + d2;
			�� ���·� �Է��ϸ� error�߻�
			�׸��� ũ�Ⱑ �ٸ��Ƿ� ���������� �Ұ����� ����
			d1, d2�� 8byte
			int�� 4byte
			
			���� �����ζ� ����ϴ� ��쿡��?
			������ ������ �ٲ������ ��
			*/
		
		// ĳ���� ������ - ������
		
		//int var1 = (int)d1 + (int)d2;
		int var1 = (int)(d1 + d2); // �������� ������ �ǹ�
		//(int) : ĳ���� ������, ������ ������ 
		//������ ���� �Է��ϴ� ���̹Ƿ� d1�� 0.5���� ���ư����� ��¿������..
		java.lang.System.out.println("var1 = "+var1);
		
		
		// ĳ���� ������ - ������
		
		//double d3 = (double)var1;
		double d3 = var1; //�������� ������ 
		java.lang.System.out.println("d3 = "+ d3);	
		//���� �׸��� ū�׸��� ������ �ֱ� ������ ĳ���� ������ ���������� ��� �����ϴ�
		
		
		byte b = (byte)var1; 
		/* ������� var1�� double 8byte 
			byte �� 1byte�̹Ƿ� 
			���������� ǥ���������*/
		java.lang.System.out.println("b = "+ b);	
		
		
		b = 100;
		// 127���� ��� �����ϴ� ����� �� ��µȴ�
		/* b = b + 5;
			���� ��*/
		/* python������ �ּҸ� �����ϴ� �����̿��� ���� ũ������ ��� ����
		   but, java�� ��¥ ���� ������ b��� ���� ������ 100
				�׷��⿡ ���°� ���, �����ϴ°��� ��ٷο�
			�׷��� ������ �� ��ٰ�?
				b=100 b�� ���� ��� �������� �ʰ� �ٷ� �����
				but b= b+5�� ������ �Ǹ鼭 
				�ӽ� ������ ������ �ȴ�
				105��� ���� ����� �޸��� type�� �����ΰ�
				���� ������ �����Ǿ� ���� ���� ���� default�� int(������)�� ��
			�׷��ϱ� b=b+5�� int����
				������ ���� �ʾ� ������ ���
				�̷���!! ĳ���� ������ - ������ ����ؾ���
			�׸���(byte)5 �̷� ���� �Ұ���
				��� �ѹ��� ǥ��������*/
				
		//����1
		//b = (byte)(b + 5);
		
		//����2
		b += 5;
		/*���� ������ +=
 		  java���� ������ �� ��ȯ�Ǵ� ����� ����*/
		java.lang.System.out.println("b = "+ b);	
		
		
		//float f = 3.14;
		/* �Ǽ��� ���, ���� 3 �Ҽ� 14 ������ ���� �����ϰ� �ȴ�
		   3.14�� ������(���� 5)�ʹ� �ٸ��� ��� ���� �ƴϹǷ� 
		   (float)3.14 �� �Ἥ �� ��ȯ ����*/
		
		//����1
		//float f = (float)3.14;
		
		//����2
		float f = 3.14f;
		/* ���ڵڿ� ������ Ÿ���� ���ڸ� �ٿ��൵ 
			������ �� ��ȯ ����
			ĳ���� ������ �� �ϳ�*/
		//f = f + 2.5f;
		//f = (float)(f+2.5);
		f += 2.5;
		/* �Ǽ��� �Ҽ��� �ڸ����� �����ϰ� ������ �� ����ؾ���
			�׷� �� ������ ��� �ϴ°���?*/
		java.lang.System.out.println("f = "+ f);	
		
		long var2 = 100;
		var2 = var2 + 1000;
		// long������ �� Ŀ ������ ĳ�������� �������� ������ �̷���� 
		
		//var2 = 25000000000;
		/* 250���� �ʹ����� ū ���̶� error�߻�
		   �ٵ� ���߿� ū�� �̿��ؾ��ϸ� ���...?
		   250���� default�� int���� ��
		   �׷��⿡ long������ �ٲ������
		   �ٵ� 250���� �������̶� (long)25000000000 ���·� ����
		   �׷��⿡ 250�� �ڿ� long�� ����ǥ �޾�����*/
		var2 = 25000000000L;
		java.lang.System.out.println("var2 = "+ var2);	
		
		int i = 'a';
		java.lang.System.out.println("i = "+ i);
		// ASCII �ڵ�� ��ȯ��
		
		char c = 98;
		java.lang.System.out.println("c = "+ c);
		/*  ASCII �ڵ�� ��ȯ��
			���ڿ� ���ڰ��� �ڵ������� ����ȯ��*/
			
		System.out.println("\n\n\n");
		
		//���� ������ 
		int data = 10;
		char result = (data > 5) ? 'T' : 'F';
		System.out.println(result);
		
		
	}
}








