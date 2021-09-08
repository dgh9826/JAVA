package Object06.lab2;

public class Car {				//this 객체 자신을 지칭 
	//field
	String model;																	// 차종 변수
	int speed;						// 속도 변수
	
	//constructor
	Car(String model){				//생성자(model)
		this.model=model;			//입력한 model은 생성된 instance의 model 값에 저장
	}
	
	void setSpeed(int speed) {		//속도 변환 method
		this.speed=speed;			//입력된 속도는 생성된 instance의 speed 값에 저장
	}
	void run() {					//달리는 method
		for(int i=0;i<=50;i+=10) {	//i = 0부터 50까지 10씩 증가하면서 반복
			setSpeed(i);			//speed는 i가 반복되면서 증가 
			System.out.println(this.model+"가 달립니다.(시속: "+this.speed +"km/h)");
		}
	}

}
