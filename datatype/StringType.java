package datatype;

import java.util.Arrays;

public class StringType {
	public static String[] shuffle(String[] array){
	    for(int x=0;x<array.length;x++){
	      int i = (int)(Math.random()*array.length); //3,array.length = 7 1~7까지 랜덤으로 반환
	      int j = (int)(Math.random()*array.length);//5,array.length = 7 1~7까지 랜덤으로 반환
	            
	      String tmp = array[i];
	      array[i] = array[j];
	      array[j] = tmp;
	    }        
	    return array;
	}

	public static void main(String[] args) {
		/*
		 * String형 : 참조형 --기본자료형이 아님
		 * 문자열 저장하는 데이터타입
		 * 문자열은 ""감싼다.
		 * +는 숫자연산에 사용될때는 더하기를 으미
		 * 문자열에 사용딜때는 문자열 연결을 의미
		 * 문자열+숫자는 문자열
		 */	
		String[] array= {"Jimin","Jin","Jeongguk","RM","JHOP","Sugar","V"};
		System.out.println(Arrays.toString(array));
		String [] array_suf= shuffle(array);
		System.out.println(Arrays.toString(array_suf));
		String strNumber=99+"";
		String strNumber2 ="100";
		System.out.println(strNumber+strNumber2);
		String newString=new String("new 연산자 사용");
		System.out.println(newString);
		String basic = "기본형 자료형처럼 문자열 저장";
		System.out.println(basic);
	}
}
