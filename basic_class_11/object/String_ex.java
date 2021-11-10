package basic_class_11.object;

public class String_ex {
	public static void main(String[] args) {
		//String , Integer, Boolean 등은 toString()메소드가 재정의되어져있다.
		//String, Integer, Boolean 등은 equals() 메소드도 재정의 되어져있다.
		//String 을 객체화 해서 객체 변수에 저장 : Heap영역에 저장.
		
		String str = new String("홍길동");
		String str1 = new String("홍길동");		//객체화 해서 객체 변수에 저장
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1);		//== : 객첼흘 비교할 때 객체의 번지를 비교
		System.out.println(str.equals(str1));	//equals() : 값을 비교
		
		String str2 = "이순신";					//상수풀에 저장이됨[같은 이름이 있으면 그 값의 주소를 가르킴]
		String str3 = "이순신";
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
	}
}
