class Exercise2 {
	public static void main(String[] args) {
		
	/*
	�Ʒ��� ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�. 
	���� ���� num�� ���� ��456���̶�� ��400���� �ǰ�, ��111���̶�� ��100���� �ȴ�. 
	(1)�� �˸��� �ڵ带 �����ÿ�.
	*/
		
	int num = 456;
	   System.out.println( num - (int)(num % 100) );	
		/*System.out.println( num/100*100 );	
			�� �ĵ� ���� */
	}
}