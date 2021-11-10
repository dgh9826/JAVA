package gnenric_12.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {		//이름을 4개 입력받아 ArrayList에 저장하고 제일 긴 이름을 출력

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		//4명의 이름을 입력받아서 ArrayList에 저장
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력 하세요 >> ");
			String s = sc.next();
			a.add(s);
		}
		int name = 0;
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		for(int i =0;i<a.size();i++) {
			if(a.get(name).length()<a.get(i).length()) {
				name = i;
			}
		}
		System.out.println("가장 긴 이름 : "+a.get(name));
		System.out.println(a.get(0)+"길이"+a.get(0).length());
		sc.close();	
	}
}
