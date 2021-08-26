package datatype;

public class ConstantVariable {
	/*
	 * 상수 : 저장된 값이 절대 변하지 않는 메모리의 한종류
	 * 상수 선언 후 중간에 값을 변경하면 에러
	 * 변수명은 대문자로 선언
	 * 가독성을 높이며 유지 보수에도 유리하다.
	 * final 자료형 변수명 = 값;
	 * 클래스안에 선언된 변수는 클래스변수,상수.
	 * 메소드안에 선언된 변수는 지역변수.
	 */
	final static int x = 150;
	static final int SCISSORS =1;
	static final int ROCK =2;
	static final int PAPER =3;
	public static void main(String[] args) {
		int b = x;
		System.out.println(b);
		int[] array = {SCISSORS,ROCK,PAPER};
		final String nickname;
		nickname = "자바";
		System.out.println(nickname);
		
		double computer=1;
		int user=2;//가독성이 떨어진다.
		computer=SCISSORS;
		user=ROCK;
		System.out.println("computer: "+SCISSORS+", user: "+ROCK);
		System.out.println("user win");
	}

}
