class Example1{
	public static void main(String[] args){

	
	
	
	/*
	�� ���͸� �������� �ٲ㺸��.
	�ΰ��� double������ �̿��ؼ� ���� ������ ���Ͱ��� �����ϰ� 
	�������� �ش��ϴ� ���Ͱ����� �ٲ㺸��.(1������ 3.7584�����̴�)
	*/
	
	double L = 3.7584D, G = 1 , Change;
	Change = G * L;
	java.lang.System.out.println("Change =" + Change);	
		
	
	/*
	�� ���� �߷��� ���� �߷��� 17% �����̴�. 
	�޿����� ����� ü���� ����ϴ� ���α׷��� �ۼ��϶�.
	*/
	
	double Weight = 100.0D, Moon = 0.17D, Moon_Weight;
	Moon_Weight = Weight * Moon;
	java.lang.System.out.println("Moon_Weight = " + Moon_Weight);	
	
	
	/*
	�� ������ �󸶳� �� ������ �߻��߳�?
	(���� �Ҹ��� ���� ����� ������ ġ�� ���������� �� ��Ʈ ���� ������ �ִ°��� ����϶�. 
	�Ҹ��� ���� ���� �� 1,100 ��Ʈ/���� �ӵ��� �����Ѵ�. 
	- ������ �� �ð��� õ�ռҸ��� ���� �ð� ������ �ð��� �˸� �Ÿ��� ����� �� �ִ�. 
	���⼭�� 7.2�ʷ� ��������)
	*/	
	
	double speed = 1100D, sec = 7.2D, Distance;
	Distance = speed * sec;
	java.lang.System.out.println("Distance = " + Distance);	
	
	}
}