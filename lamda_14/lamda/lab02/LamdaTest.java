package lamda_14.lamda.lab02;

interface PrintString{			//람다식을 변수 처럼 사용 (1. 변수에 값대입, 2.매개변수로 전달, 3.리턴 할 때)
	
	void showString(String str);
}
public class LamdaTest {
	
	public static void showMyString (PrintString p) {
		p.showString("Hello Lambda_02");
	}
	
	public static PrintString returnString(){
		
		return s -> System.out.println(s + "Lambda_03");
	}

	public static void main(String[] args) {
		
		System.out.println("1.람다식을 변수에 대입");
		PrintString lamda = s -> System.out.println(s);
		lamda.showString("Hello Lambda_01");
		
		System.out.println("2.매개변수로 전달");
		showMyString(lamda);
		
		System.out.println("3.리턴 값으로 람다식 사용");
		PrintString reStr = returnString();
		reStr.showString("Hello");
	}
}
