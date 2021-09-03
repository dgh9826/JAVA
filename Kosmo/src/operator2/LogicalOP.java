package operator2;

public class LogicalOP {

	public static void main(String[] args) {
		/* b1&&b2 :  b1과 b2 모두가 true일때만 true이고 나머지는 false 리턴
		 * b1||b2 :  b1과 b2 모두가 false일때 false이고 나머지는 true 리턴
		 * b1&b2 : b1과 b2 모두가 true일떄 true이고 나머지는 false 리턴
		 * b1|b2 : b1과 b2모두가 false일때 false이고 나머지는 true리턴
		 * ^,| 연산자는 &&,|| 연산자보다 우선 순위가 높다
		 */
		
//		System.out.println("ONE");
//		System.out.println(1);
//		System.out.println(true);
//		System.out.println(false);
//		System.out.println(1==1);
//		//AND
//		System.out.println(true&&true); // true
//		System.out.println(false&&true); //false
//		System.out.println(true&&false); //false
//		System.out.println(false&&false); //false
//		
//		//OR
//		System.out.println(true||true); // true
//		System.out.println(false||true); //true
//		System.out.println(true||false); //true
//		System.out.println(false||false); //false
//		//NOT
//		System.out.println(!true);//false
//		System.out.println(!false);//true
		
		String id ="egoing";
		String inputId =args[0];
	
		String pwd = "1111";
		String pwd2 ="2222";
		String inputpwd = args[1];
	
		System.out.println("Hi");
		boolean isR =(inputpwd.equals(pwd) || inputpwd.equals(pwd2));
		if(inputId.equals(id) && isR) {
			System.out.println("Master");
		}else {
			System.out.println("Who are you?");
		}
		
		System.out.println(1);
		int i=0;
		System.out.println("====while======");
		while(i<3) {
			System.out.println(2);
			System.out.println(3);
			i++;
		}
		System.out.println("====for======");
			for(int j=0; j<3; j++) {
				System.out.println(2);
				System.out.println(3);
				}
		System.out.println(4);
		
		String[] n = {"egoing","jinhyuck","youbin"};
		
		for(int e=0; e<n.length; e++) {
			System.out.println("<li>"+n[e]+"</li>");
		}
	}
}
		
	

