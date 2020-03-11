class Example1{
	public static void main(String[] args){

	
	
	
	/*
	■ 리터를 갤런으로 바꿔보자.
	두개의 double변수를 이용해서 각각 갤런과 리터값을 저장하고 
	갤런값을 해당하는 리터값으로 바꿔보자.(1갤런은 3.7584리터이다)
	*/
	
	double L = 3.7584D, G = 1 , Change;
	Change = G * L;
	java.lang.System.out.println("Change =" + Change);	
		
	
	/*
	■ 달의 중력은 지구 중력의 17% 정도이다. 
	달에서의 당신의 체중을 계산하는 프로그램을 작성하라.
	*/
	
	double Weight = 100.0D, Moon = 0.17D, Moon_Weight;
	Moon_Weight = Weight * Moon;
	java.lang.System.out.println("Moon_Weight = " + Moon_Weight);	
	
	
	/*
	■ 번개가 얼마나 먼 곳에서 발생했나?
	(번개 소리를 들은 사람이 번개가 치는 곳에서부터 몇 피트 정도 떨어져 있는가를 계산하라. 
	소리는 공기 중을 약 1,100 피트/초의 속도로 진행한다. 
	- 번개를 본 시각과 천둥소리를 들은 시각 사이의 시간을 알면 거리를 계산할 수 있다. 
	여기서는 7.2초로 가정하자)
	*/	
	
	double speed = 1100D, sec = 7.2D, Distance;
	Distance = speed * sec;
	java.lang.System.out.println("Distance = " + Distance);	
	
	}
}