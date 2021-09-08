import java.util.Scanner;

class Greeting{
	 /*public 공용 메소드
	 * protected
	 * private 해당 클래스에서만 사용가능한 메소드
	 * default 
	 * 
	 * static - class method
	 * no static - instance method
	 * 싱글톤(Singleton) 단 하나의 객체만 만들도록 보장해야 하는 객체 
	 */

	public static void hi() {
		System.out.println("Hi");
	}
}
public class ModifiersMethod {

	public static void main(String[] args) {
		Greeting.hi();
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		//===문항 17===
		String str[] = {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		boolean run=true;
		while(run){
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보! >> ");
			String user = sc.next();
			if(str[n].equals(user)) {
				System.out.println("사용자 = "+user+", 컴퓨터="+str[n]+" 비겼습니다.");
			}else if(user.equals("바위")) {
				System.out.println(str[n]==str[0]?"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 이겼습니다."
						:"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
			}
			else if(user.equals("가위")) {
				System.out.println(str[n]==str[2]?"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 이겼습니다."
						:"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
			}
			else {
				System.out.println(str[n]==str[1]?"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 이겼습니다."
						:"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
			}
			if(user.equals("그만")){
				System.out.println("게임을 종료합니다...");
				run=false;
				
			}
		}
		
		//===문항 16===
//		String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
//		int score[] = {95,88,76,62,55};
//		Scanner sc = new Scanner(System.in);
//		boolean run = true;
//		int i=0;
//		while (run) {
//			System.out.print("과목 이름 >> ");
//			String study = sc.next();
//			for(i=0;i<course.length;i++) {
//				if(course[i].equals(study)) {
//					System.out.println(course[i]+"의 점수는 "+score[i]);
//					break;
//				}
//			}
//			if (study.equals("그만")){
//				System.out.println("종료");
//				run = false;
//				break;
//			}
//			if(i==course.length) {
//				System.out.println("없는 과목입니다.");
//			}
//		}
		
		
		//===문항 15===
		/*
		for(int i=1;i<100;i++) {
			int a = i%10;
			int b = i/10;
			if((a==3||a==6||a==9)&&(b==3||b==6||b==9)) {
				System.out.println(i+"박수 짝짝");
			}else if((a==3||a==6||a==9)||(b==3||b==6||b==9)) {
				System.out.println(i+"박수 짝");
			}
		}*/
		
		
		//===문항 14===
		/*
		int num[] = new int[10];
		double sum=0;
		for(int j=0;j<num.length;j++) {
			int i = (int)(Math.random()*10+1);
			num[j]=i;
			sum+=num[j];
		}
		System.out.print("랜덤한 정수들 :");
		for(int j=0;j<num.length;j++) {
			System.out.print(" "+num[j]);
		}
		System.out.println("평균은 "+(sum/10));
		*/
		//===문항 12===
//		Scanner sc= new Scanner(System.in);
//		System.out.print("양의 정수 10개를 입력하시오 >> ");
//		int[] num = new int[10];
//		for(int i=0;i<num.length;i++) {
//			num[i] = sc.nextInt();
//		}
//		System.out.print("3의 배수는 ");
//		for(int i=0;i<num.length;i++) {
//			if(num[i]%3==0) {
//				System.out.printf("%d ",num[i]);
//			}
//		}
		//===문항 13===
//		int[] unit = {50000,10000,1000,500,100,50,10,1};
//		Scanner sc = new Scanner(System.in);	
//		System.out.print("금액을 입력하시오 :");
//		int value = sc.nextInt();
//		for(int i=0;i<unit.length;i++) {
//				System.out.println(unit[i]+"원 짜리 :" + value/unit[i]+"개");
//				value-=unit[i]*(value/unit[i]);
//		}
		//===문항 6===
//		int max=0;
//		int[] array = {4,5,1,2,3,};
//		max = array[0];
//		for(int i=0;i<array.length;i++) {
//			if(max<array[i])
//				max=array[i];
//		}
//		System.out.println(max);
//		==문항 4==
//		for(int i =0;i<4;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		==문항 5==
//		int [] sco = {1,2,3,4,5,6,7,8,9,10};
//		int sum = 0;
//		for(int i=0;i<sco.length;i++) {
//			sum += sco[i];
//		}
//		System.out.println(sum);
	}

}