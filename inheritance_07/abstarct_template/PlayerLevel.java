package inheritance_07.abstarct_template;

public class PlayerLevel {
	public void run() {
	}
	public void jump() {
	}
	public void turn() {
	}
	public void showLevelMassage() {
	}
	
	final public void go(int count){ //템플릿 메소드 : 로직을 구현, 오버라이딩 불가
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}
}
