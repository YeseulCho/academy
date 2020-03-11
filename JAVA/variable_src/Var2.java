class Var2{
	public static void main(String[] args){
		int a = 10;
		{
			int b = 20;
			java.lang.System.out.println("b=" + b);
			java.lang.System.out.println("a=" + a);
			//a의 값은 현재 {}안에 포함되어있다고 보면된다
			{
				int c = 30;
				java.lang.System.out.println("c=" + c);
			}
		}
		/*java.lang.System.out.println("b=" + b);
		  여기에 b입력하면 변수를 찾을수 없다고 나옴
		  b는 앞의 {}안에 포함되어있는 변수이므로 선언된 블럭을 벗어났다고 보면된다*/
	}
}