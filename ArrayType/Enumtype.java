package ArrayType;

import java.util.Calendar;

public class Enumtype {

	public static void main(String[] args) {
		/*열거 타입
		 * public enum 열거타입이름{상수1이름,상수2이름....}//선언
		 * -데이터타입
		 * -상수는 주로 대문자로 사용
		 * 허용가능한 값들을 제한
		 * 
		 * 열거 타입 변수:
		 * 열거 타입 변수;
		 * EX) Week week;
		 * 
		 * 열거체이름.열거상수
		 * EX) week=Week.MONDAY
		 */
		Week today;
		today = Week.MONDAY;
		System.out.println("today = "+today);
		
		//name() method
		String name = today.name();
		System.out.println("name: "+name);
		//ordianl() method
		//전체열거 객체중 몇번째 열거 객체인지 return
		System.out.println("ordinal: "+today.ordinal());
		
		//compareTo() method
		Week day1 = Week.MONDAY;
		Week day2 = Week.THRSDAY;
		
		String a1="wellcom";
		System.out.println(a1.compareTo("we"));
		String a2="com";
		System.out.println(a1.contains(a2));
		
		
		int result=day2.compareTo(day1);
		System.out.println("result: "+result);
		
		//valueOf(매개변수) method
		//매개변수 값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체 리턴
		Week weekday=Week.valueOf("SATURDAY");
		System.out.println("weekday: "+weekday);
		
		Calendar cal = Calendar.getInstance();
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		Week toDay = Week.MONDAY;
		switch(wk) {
		case 1: toDay = Week.SUNDAY; break;
		case 2: toDay = Week.MONDAY; break;
		case 3: toDay = Week.TUESDAY; break;
		case 4: toDay = Week.WENDESDAY; break;
		case 5: toDay = Week.THRSDAY; break;
		case 6: toDay = Week.FRIDAY; break;
		case 7: toDay = Week.SATURDAY; break;
		}
		System.out.println("오늘 : "+toDay);
	}

}
