package ControlStatement;

import java.io.IOException;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) throws IOException {
//		switch() {
//		case1
//		
//		case2
//		
//		case
//		
//		default
//		}
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자을 입력하세요: ");
//		int input =sc.nextInt();
//		System.out.println("result: "+input);
//		int remain = input%3;
//		System.out.println("[if문으로 나머지값 판단]");
//		if(remain==0) {
//			System.out.println("나머지가 0");
//		}
//		else if(remain==1) {
//			System.out.println("나머지가 1");
//		}
//		else { System.out.println("나머지가2");}
//		System.out.println("[switch 문으로 나머지값 판단");
//		switch(remain) {
//		case 0:
//			System.out.println("나머지가 0");
//			break;
//		case 1:
//			System.out.println("나머지가 1");
//			break;
//		default:
//			System.out.println("나머지가 2");
//		}
		
//		System.out.println("첫번째 숫자 입력: ");
//		int fnum=sc.nextInt();
//		System.out.println("연산자 기호 입력: ");
//		char op=(char)System.in.read();
//		System.out.println("두번째 숫자 입력: ");
//		int snum=sc.nextInt();
//		System.out.println("fnum: "+fnum+",op: "+op+",snum: "+snum);
//		
//		switch(op) {
//		case '+' :
//			System.out.printf("%d+%d = result:%d \n",fnum,snum,fnum+snum);
//			break;
//		case '-' :
//			System.out.printf("%d-%d = result:%d \n",fnum,snum,fnum-snum);
//			break;
//		case '*' :
//			System.out.printf("%d*%d = result:%d \n",fnum,snum,fnum*snum);
//			break;
//		case '/' :
//			System.out.printf("%d/%d = result:%d \n",fnum,snum,fnum/snum);
//			break;
//		case '%' :
//			System.out.printf("%d%%d = result:%d \n",fnum,snum,fnum%snum);
//			break;
//		}
		//switch 문에는 정수식 결과값이 byte/short/int/char/String타입/enum타입만 허용
		//boolean값은 불가 비교식이나 논리식은 사용할 수 없다.
		
		String sub="수학";
		switch(sub) {
		case "국어":
			System.out.println("과목은 국어");
			break;
		case "수학":
			System.out.println("과목은 수학");
			break;
		case "영어":
			System.out.println("과목은 영어");
			break;
		}
		System.out.print("지역을 입력해주세요 : ");
		String inputstr= sc.next();
		switch(inputstr) {
		case "busan":
			System.out.println("어서오세요 부산입니다.");
			break;
		case "incheon":
			System.out.println("어서오세요 인천입니다.");
			break;
		case "seoul":
			System.out.println("어서오세요 서울입니다.");
			break;
		case "daegu":
			System.out.println("어서오세요 대구입니다.");
			break;
		}
		
//		System.out.print("국어 점수 입력 :");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수 입력 :");
//		int eng = sc.nextInt();
//		System.out.print("수학 점수 입력 :");
//		int math = sc.nextInt();
//		int avg =(kor+eng+math)/30;	
//		switch(avg) {
//		case 10:
//			System.out.println("A학점입니다.");
//			break;
//		case 9:
//			System.out.println("A학점입니다.");
//			break;
//		case 8:
//			System.out.println("B학점입니다.");
//			break;
//		case 7:
//			System.out.println("C학점입니다.");
//			break;
//		case 6:
//			System.out.println("D학점입니다.");
//			break;
//		default :
//			System.out.println("F학점입니다.");
//			break;
//		}
		
		System.out.println("메달 색을 입력해주세요.(Gold or Silver or Bronze)");
		String medal =sc.next();
		
		switch (medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		sc.close();
	}
	
}


