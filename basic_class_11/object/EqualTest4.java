package basic_class_11.object;

class Mydate {
	int day;
	int month;
	int year;
	public Mydate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public int hashCode() {
		return day+month+year;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mydate) {
			Mydate d = (Mydate)obj;
			if(year == d.year && month == d.month && day==d.day) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return year+"년, "+month+"월, "+day+"일 입니다.";
	}
}

public class EqualTest4 {

	public static void main(String[] args) {
		Mydate day1 = new Mydate(27, 9 ,2021);
		Mydate day2 = new Mydate(27, 9, 2021);
		
		System.out.println(day1);								//16진수 hashcode 
		System.out.println(System.identityHashCode(day1));		//10진수
		System.out.println(System.identityHashCode(day2));
		
		System.out.println(day1==day2);
		System.out.println(day1.equals(day2));
		
		
	}

}
