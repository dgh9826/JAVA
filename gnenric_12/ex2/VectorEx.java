package gnenric_12.ex2;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);		//index0
		v.add(4);		//index1
		v.add(-1);		//index2
		
		v.add(2,100);	//index2에 100을 삽입 (4와 -1 사이에 정수 100을 삽입 => 원래 index2에 있던 -1은 뒤로 밀려 index3으로 이동됨)
		
		System.out.println("벡터 내의 객체 갯수 : "+v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());
		int sum =0;
		for(int i=0; i<v.size();i++) {
			int n = v.get(i);
			sum +=n;
		}
		System.out.println("벡터내 합 : "+sum);
	}
}
