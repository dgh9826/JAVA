package inheritance_07.abstract_ex;

public class Notebook extends Computer{
				//추상 클래스: 슈퍼클래스의 메소드 일부만 구현한 경우, 추상 클래스가 되어야 한다.
	@Override
	public void display() {
		System.out.println("노트북 모니터");		
	}

	@Override
	public void typing() {
		
	}


}
