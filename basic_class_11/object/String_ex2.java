package basic_class_11.object;

public class String_ex2 {
	public static void main(String[] args) {	//concat() : 두문자열을 연결해서 출력: 쓰레기값 발생
												// 작은 양의 문자열을 연결할 때 사용
												// 별도의 메모리 영역을 새로 생성 연결.
		String javastr = new String("Java");
		String android = new String("android");
		
		System.out.println(javastr);
		System.out.println(System.identityHashCode(javastr));	// 메모리의 쓰레기 영역
		
		javastr = javastr.concat(android);		// concat():두개의 문자열을 연결해서 출력
		
		System.out.println(javastr);
		System.out.println(System.identityHashCode(javastr));
	}
}
