class Exercise1 { 
	public static void main(String[] args) { 
	
	/*
	�Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����) �� ���� ���ϴ� �ڵ��̴�. 
	���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 13���� �ٱ��ϰ� �ʿ��� ���̴� 
	(1)�� �˸��� �ڵ带 �����ÿ�.
	*/
	
	// ����� ���� 
	int numOfApples = 123; 
	
	// �ٱ����� ũ�� (�ٱ��Ͽ� ���� �� �ִ� ����� ����)  
	int sizeOfBucket = 10;
	
	// ��� ����� ��µ� �ʿ��� �ٱ����� ��  
	int numOfBucket = (numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0?1:0));
	/* int numOfBucket = (int)(numOfApples / sizeOfBucket) + 1 ;
		����� ������ 120�� ���, �ٱ����� ���� +1 ���ص� �Ǳ� ������
		(numOfApples%sizeOfBucket>0?1:0)���� ó������ */
	
	System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
		
		}
	}