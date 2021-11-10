package array_05;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		
		double data[] = new double[5];
		double sum =0.0;
		double total=1.0;
		int size =0;
		
		data[0]=10.0; size++;
		data[1]=20.0; size++;
		data[2]=30.0; size++;
		
		
		System.out.println(data.length);
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
			sum +=data[i];
		}
		
		System.out.println("총 합은: "+sum);
		
		for(int i=0;i<size;i++) {
			total *= data[i];
		}
		System.out.println("총 곱은: "+total);

	}

}
