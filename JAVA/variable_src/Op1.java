class Op1{
	public static void main(String[] args){
		int num1 = 10;
		
		//1�� ������Ű�� ���
		
		//���� 1�� ����
		num1 = num1 + 1;
		java.lang.System.out.println(num1);
		
		num1++;
		java.lang.System.out.println(num1);
		
		++num1;
		java.lang.System.out.println(num1);
			//���� �ϳ��� �� ���� ++�� �տ� ���� �ڿ� ���� �������
		
		// ���� 2�� ���� : �ǵ����̸� �ڵ� �����ϰ� ¥������ 
		int num2 = 10, num3 = 0;
		num3 = ++num2;
		java.lang.System.out.println("num2 :" + num2 + ", num3 : " + num3);
			/* num2�� ���� ���� ������Ŵ
			   �׷��⿡ num3�� ������ ���� �Է¹���*/
		
		int n2 = 10, n3 = 0;
		n3 = n2++;
		java.lang.System.out.println("n2 :" + n2 + ", n3 : " + n3);
			/* �켱������ ���� n2�� ���� n3�� ���� �Ҵ��Ŵ
			   �� �Ŀ� n2�� ���� �����ϰ� �ȴ�*/
	}
}