package Object06.hide.package1_3;

public class Car {
	private int speed;			//private 속성 speed 변수
	private boolean stop;		//private 속성 stop 변수
	
	public int getSpeed() {		//speed변수 getter
		return speed;
	}

	public void setSpeed(int speed) { //speed변수 setter
		if(speed<0) {					//0보다 작으면 0을 return
			this.speed=0;
			return;
		}else {
		this.speed = speed;
		}
	}

	public boolean isStop() {	//stop변수 getter
		return stop;			
	}

	public void setStop(boolean stop) { //stop변수 setter	
		this.stop = stop;				//true 일경우 true를 넘기고
		speed=0;						//speed=0으로 
	}


}
