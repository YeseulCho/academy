class Var2{
	public static void main(String[] args){
		int a = 10;
		{
			int b = 20;
			java.lang.System.out.println("b=" + b);
			java.lang.System.out.println("a=" + a);
			//a�� ���� ���� {}�ȿ� ���ԵǾ��ִٰ� ����ȴ�
			{
				int c = 30;
				java.lang.System.out.println("c=" + c);
			}
		}
		/*java.lang.System.out.println("b=" + b);
		  ���⿡ b�Է��ϸ� ������ ã���� ���ٰ� ����
		  b�� ���� {}�ȿ� ���ԵǾ��ִ� �����̹Ƿ� ����� ���� ����ٰ� ����ȴ�*/
	}
}