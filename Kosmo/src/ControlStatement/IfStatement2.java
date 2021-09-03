package ControlStatement;

import java.io.IOException;

public class IfStatement2 {

	public static void main(String[] args) throws IOException {
		/*if문 
		 * if(조건식1){
		 *		조건식 1이ㅣ 참일때 실행되는 명령문1
		 * } 
		 * else if(조건식2){
		 * 		조건식 2이ㅣ 참일때 실행되는 명령문2
		 * }
		 * else if(조건식3){
		 * 		조건식 3이ㅣ 참일때 실행되는 명령문3
		 * }
		 * ,,,,,,,,,,,,,,,,,,,,
		 * else if(조건식n){
		 * 		조건식 n이ㅣ 참일때 실행되는 명령문n
		 * }
		 * else{
		 *		모든 조건식이 거짓일때 실행되는 명령문
		 *}
		 */
		int kor=90, eng=80, math=89;
		double avg =(kor+eng+math)/3.0;
		
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60){
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
		
		System.out.println("Enter: ");
		int c1=System.in.read();
		System.in.skip(2);
		if(c1>='0'&&c1<'9') {
			if(c1%2 ==0) {
				System.out.println("2의배수: "+(char)c1);
			} else { 
				System.out.println("2의배수가 아님");
			}
		}
		else if (c1>='A'&&c1<='Z') {
			System.out.println("대문자: "+(char)c1);
			}
		else if(c1>='a'&&c1<='z') {
			System.out.println("소문자: "+(char)c1);
			}
		else {
		System.out.println("기타");
		}
		
		int num1=44, num2=20, num3=10;
		int max;
		if(num1>num2&&num1>num3) {
				System.out.println("최댓값: "+num1);
			}
		else if(num2>num1&&num2>num3) {
				System.out.println("최댓값: "+num2);
			}
		else {
			System.out.println("최댓값: "+num3);
		}
	}
}


