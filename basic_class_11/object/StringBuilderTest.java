package basic_class_11.object;

public class StringBuilderTest {		//StringBuilder : 단일쓰레드 환경에서 대량으로 문자열 연결할때 사용

	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javastr 주소: "+System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산전 buffer 메모리 주소: "+System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" program is fun!!");
		
		System.out.println("연산 후 buffer 메모리 주소: "+System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javastr 주소 : "+System.identityHashCode(javaStr));
	}
}
