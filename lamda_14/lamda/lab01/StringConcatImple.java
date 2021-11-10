package lamda_14.lamda.lab01;

public class StringConcatImple implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1+", "+s2);
		if(s1.length()>s2.length()) {
			System.out.println(s1);
		}else if(s1.length()<s2.length()){
			System.out.println(s2);
		}else {
			System.out.println("길이가 같습니다.");
		}
	}

	
}
