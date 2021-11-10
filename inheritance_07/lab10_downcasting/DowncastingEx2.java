package inheritance_07.lab10_downcasting;

import java.util.Random;

public class DowncastingEx2 {

	public static void main(String[] args) {
		int arr[]= {10,2,30,40};
		int rank[]= new int[arr.length];
		for(int i=0;i<rank.length;i++)
			System.out.println(rank[i]);
		System.out.println(++rank[0]);
		Random random = new Random();
		int n=random.nextInt(6);
		System.out.println(n);
		long time = System.currentTimeMillis();
		System.out.println(time/1000000000000L);
//		Student s;			//객체변수(인스턴스 변수) 선언 :s
//		Person p;			//객체변수(인스턴스 변수) 선언 :p
//		
//		s=new Student("홍길동"); //Student 객체 생성 
//		System.out.println("==========업캐스팅==========");
//		p=s;
//	//=>p=(Person)s; 		//업캐스팅 => 강제 데이터타입 생략가능 -(Person)
//		p.id="2000"; p.name="피오";
//		p.fly();			//오버라이딩된 fly메소드
//		
//		System.out.println("==========다운캐스팅=========");
//		s=(Student)p; 		//다운캐스팅
//		s.id="3000"; s.name="지코"; s.grade="3"; s.department="컴공";		
//		s.fly();			//오버라이딩된 fly메소드
	}

}
