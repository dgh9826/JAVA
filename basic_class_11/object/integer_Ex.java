package basic_class_11.object;

public class integer_Ex {

	public static void main(String[] args) {
		Integer in = new Integer(200); 
		Integer in1 = new Integer(200);
		
		System.out.println(in);
		System.out.println(in1);
		System.out.println(in==in1);
		System.out.println(in.equals(in1));
		
		int in2 = 300;
		int in3 = 300;
		
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in2==in3);		//객체에서 주소를 비교
//		System.out.println(in2.equals(in3));
	}

}
