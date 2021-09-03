package Object06_lab;

public class Car { // 생성자 Overloading : 같은 이름의 생성자에서 input값을 다르게 호출
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	Car(String model){// input 매개변수 이름, 할당하는 변수이름, 메모리의 변수이름
		this(model,"black",250);
	}
	Car(String model, String color){//overLoading
		this(model,color,220);
	}
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
	