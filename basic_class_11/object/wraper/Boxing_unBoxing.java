package basic_class_11.object.wraper;

public class Boxing_unBoxing {
	// AutoBoxing : 기본 자료형의 데이터를 객체형 변수에 할당.
	// unBoxing : 객체형의 자료형을 기본 자료형으로 사용
	// Java 5.0 : AutoBoxing, unBoxing 자동 지원
	public static void main(String[] args) {
		Integer num1 = new Integer(100);
		int num2 = 200;

		int sum = num1 + num2; // num1 자동으로 언박싱, num1.intValue();
		int sum2 = num1.intValue() + num2;

		Integer num3 = num2; // 오토 박싱 : Integer.valueOf(num2)로 자동 변환

		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);
	}
}
