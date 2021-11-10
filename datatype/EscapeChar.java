package datatype;

public class EscapeChar {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Hit HomeRun");
		System.out.println("Hit\tHomeRun\nand Hit and Run"); // \t 탭키만큼 띄어쓰기 
		System.out.println("Hit\nHomeRun"); //\n 줄바꿈
		System.out.println("My NickName is superman\rxx"); // \r 커서를 해당 줄에서 맨 처음으로 이롱(carrage return)
		
		//\' : single quotation 표시 -> 그냥 쓰거나 \와 같이 사용 같음
		System.out.println("나의 닉네임은 '스마트보이'입니다."); // -> 나의 닉네임은 '스마트보이'입니다.
		System.out.println("나의 닉네임은 \'스마트보이\'입니다.");// -> 나의 닉네임은 '스마트보이'입니다.
		//\" :double quotation 표시 -> 그냥 쓰면 오류 \"로 사용
		//System.out.println("나의 닉네임은 "스마트보이"입니다."); 
		System.out.println("나의 닉네임은 \"스마트보이\"입니다."); // ->나의 닉네임은 "스마트보이"입니다.
		// \\:뒤에 \은 이스케이프 문자 역할을ㄹ 하는 특수문자가 아니라는 것을 컴파일러에게 알려주는 기능
		System.out.println("D:\\user\\Yoon\\java"); //->D:\ user\Yon\java
		/*
		 *  Format String 출력형식을 지정하기 위한 형식 문자열
		 *  %s나 %d등의 변환지시어를 사용해서 원하는 출력 형식을 만들 수 있다.
		 *  변환지시어를 쓸 수 있는 메소드 정해져있음
		 *  [주요 변환지시어]
		 *  %d : 정수값 출력시(byte/short/int/long)
		 *  %f : 실수값 출력(float/double)
		 *  %c : 한문자 출력(char)
		 *  %b : boolean 출력
		 *  %s : 문자열 출력
		 *  %n : 줄바꿈
		 *  %% : %리터럴 의미
		 *  [형식문자열 데이터 출력시 자릿수 지정]
		 *  %4c :한문자를 출력하는데 전체 자리수는 4
		 *  %5d : 정수 숫자를 출력하는데 전체 자리수는 5
		 *  %6.2f% :실수를 출력하는데 소수점 둘째짜리까지만 출력하고 전체 자리수는 6(소수점 포함) 
		 *  자릿수 지정시 값을 오른쪽부터 채운다 & -를 붙이면 왼쪽부터 채운다
		 *  printf("%4d",12);
		 *  --12
		 *  printf("%4d",12);
		 *  12--
		 */
		int kor=95,eng=70,math=90;
		double avg = (kor+eng+math)/3.0;
//		System.out.println("[출력자리수 미지정]");
//		System.out.printf("국어:%d, 영어:%d, 수학:%d 평균: %f",kor,eng,math,avg);
//		System.out.println("[출력자리수 지정]");
//		System.out.printf("국어:%4d, 영어:%4d, 수학:%4d, 평균:%-6.2f\n",kor,eng,math,avg);
//		System.out.printf("%c, %b, %.2f, %s%n",'가',false,3.14518497,"문자열");
		
		System.out.println("---------------------------------------------");
		System.out.printf("%20s%n","자바반 성적표");
		//System.out.println("---------------------------------------------");
//		System.out.printf("%-10s%-12s%-10s%s%n","korean|","english|","math|","AVG|");
		//System.out.println("---------------------------------------------");
//		System.out.printf("%9s%11s%10s%11.2f%n","|"+kor,eng,math,avg);
		
		
		System.out.println("======================================");
		System.out.println("name kor eng math total   avg");
		System.out.println("======================================");
		System.out.printf("%s%4d%4d%5d%6d%7.2f%n","HONG",kor,eng,math,(kor+eng+math),avg);
		System.out.printf("%s%5d%4d%5d%6d%7.2f%n","KIM",90,85,80,(90+85+80),(90+85+80)/3.0);
		System.out.printf("%s%4d%4d%5d%6d%7.2f%n","PARK",85,98,97,(85+98+97),(85+98+97)/3.0);
		
		String[] na = {"Yoon","Dong","Hyun"};
		int[] ko= {99,84,91},en= {86,95,64},ma= {95,77,88};
		for (int a=0;a<na.length;a++) {
			int tot=ko[a]+en[a]+ma[a];
			double av=(ko[a]+en[a]+ma[a])/3.0;
			System.out.printf("%s%4d%4d%5d%6d%7.2f%n",na[a],ko[a],en[a],ma[a],tot,av);
		}
		String[] na1 = {"Kim","Lee","Cho"};
		int b=0;
		while(b<na.length) {
			int tot1=ko[b]+en[b]+ma[b];
			double av1=(ko[b]+en[b]+ma[b])/3.0;
			System.out.printf("%s%5d%4d%5d%6d%7.2f%n",na1[b],ko[b],en[b],ma[b],tot1,av1);
			b++;
		}
	}
}


