package ControlStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfStatement {

	public static void main(String[] args) throws IOException {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		
		int num1=10;
		if(num1%2==0) {
			System.out.printf("%d는 짝수\n",num1);
		}
		num1=9;
		if(num1%2 !=0) {
			System.out.printf("%d는 홀수\n",num1);
		}
		if(num1%2 !=0 && num1 >=9) {
			System.out.printf("%d는 홀수이고 9보다 크거나 같은 수이다\n",num1);
		} 
		//식이 하나인 경우 {}생략가능
		if(num1%2 ==0)System.out.printf("%d는 짝수\n",num1);
		
		num1=9;
		if(num1%2 !=0) {
			System.out.printf("num1은 %d이다\n",num1);
			System.out.printf("%dd은 홀수이다\n",num1);
		}
//		System.out.println("Enter: ");
//		int asc=System.in.read();
//		System.out.println("입력한 아스키코드값: "+asc);
//		System.out.println("입력한 키보드값:"+(char)asc);
//		boolean n= asc>=48&&asc<=57;
//		if(n) {
//			System.out.println("입력한 문자는 숫자입니다.");
//		}else {
//			System.out.println("입력한 문자는 숫자가 아닙니다");
//		}
		/*System.in.read()메소드:
		 * 사용자가 입력을 받을때까지 블락상태가 된다
		 * 다음코드가 실행이 되지 않음
		 * 입력한 문자의 아스키코드값 반환
		 */
//		System.out.println("Enter: ");
//		int ent =System.in.read();
//		boolean x= (ent>='0'&& ent<='9')||
//				(ent>='A'&&ent<='Z')||
//				(ent>='a'&&ent<='z') ;
//		if(x) {
//			System.out.println("알파벳 혹은 숫자입니다.");
//		}
//		if(!x) {
//			System.out.println("기타");
//		}
//		
//		System.in.skip(2);
//		char w=(char)System.in.read();
//		System.out.println("입력한 문자"+(int)w);
//		w=(char)System.in.read();
//		System.out.println("입력한 문자"+(int)w);
//		w=(char)System.in.read();
//		System.out.println("입력한 문자"+(int)w);
		
//		System.out.println("Enter: ");
//		int ent1=Integer.parseInt(in.readLine());
//		System.in.skip(2);
//		if(ent1>=0 && ent1<=100) {
//			if(ent1%2 ==0) 
//			{System.out.println("2의배수입니다.");
//			System.out.println(ent1);}
//			if(ent1 %2 != 0) {
//				System.out.println("2의배수가 아닙니다.");
//				}
//		}
//		else {
//			System.out.println("숫자가 아닙니다.");
//		}
//		System.out.println("Enter: ");
//		int ent1=System.in.read();
//		boolean a = ent1>=48 && ent1<=57;
//		System.in.skip(2);
//		if(a) {
//			System.out.println("숫자입니다.");
//		}
//		else {
//			System.out.println("숫자가 아닙니다.");
//		}
//		System.out.println(a ? "숫자입니다." : "숫자가아닙니다.");
		
		System.out.println("Enter: ");
		char c1=(char)System.in.read();
		System.in.skip(2);
		if(c1>='0'&&c1<'9') {
			if(c1%2 ==0) {
				System.out.println("2의배수입니다.");
			}
			else 
				System.out.println("2의배수가 아님");
		}
		else{
			if(c1>='A'&&c1<='Z') {
			System.out.println("대문자입니다.");
			}
			else if(c1>='a'&&c1<='z') {
			System.out.println("소문자입니다");
			}
			else
			System.out.println("기타");
		}
//		boolean run =true;
//		int speed =0;
//		int key =0;
//		while(run) {
//			if(key !=13 && key!=10) { // 13->\r의 아스키코드 값 10 -> \n  아스키코드값 :엔터키는 \r\n
//				System.out.println("-------------------");
//				System.out.println("1.증속 : 2.감속 : 3.중지");
//				System.out.println("------------------");
//				System.out.print("선택");
//			}
//			key = System.in.read();
//			
//			if(key == 49) {
//				speed++;
//				System.out.println("현재속도 = "+speed);
//			}else if(key ==50) {
//				speed--;
//				System.out.println("현재속도 = "+speed);
//			}
//			else if(key == 51) {
//				run=false;
//			}
//			}
//		System.out.println("프로그램 종료");
		
//		String foo ="Hellow World";
//		System.out.println(foo.contains("Wor"));
//		System.out.println(foo.contains("egooing"));
	
		/*primative data type
		 * boolean, int, double,  short, long, float, char 
		 * non primative data type
		 * String, array, date, file
		 */
		// int p1 =1; , int p2=1   이러면 p1과 p2는 같은 곳에 저장되어있어서 p1==p2는 참
		// String o1="java"; / String o2 = new String("java");
		//o1과 o2의 값 "java"는 다른 곳에 저장되어있으므로 o1==o2는 거짓
		// ==는 쉽게 말해 같은곳에 저장 되어있냐를 확인
		//원시데이터가 아닌 데이터들은 ex)o1.equals(o2)와 같은 메소드를 가지고 있음
		//o1.equals(o2)는 내용이 같은가를 확인
		/*primative data type
		 * boolean, int, double,  short, long, float, char 
		 * non primative data type
		 * String, array, date, file
		 */
		// int p1 =1; , int p2=1   이러면 p1과 p2는 같은 곳에 저장되어있어서 p1==p2는 참
		// String o1="java"; / String o2 = new String("java");
		//o1과 o2의 값 "java"는 다른 곳에 저장되어있으므로 o1==o2는 거짓
		// ==는 쉽게 말해 같은곳에 저장 되어있냐를 확인
		//원시데이터가 아닌 데이터들은 ex)o1.equals(o2)와 같은 메소드를 가지고 있음
		//o1.equals(o2)는 내용이 같은가를 확인
		//but String o3="java2" /String o4="java2" 은 true
	}

}
