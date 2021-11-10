package array_05.enum_ex;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringARrayArgument num1 num2");
			System.out.println("반드시 정수 2개를 args인자로 넣으세요 ex)10 20");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
				
	}

}
