package inheritance_07.lab1;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		/*
		 	CellPhone 클래스 [부모]
 			- 필드 : model, color
 			- 메소드 : powerOn(), prwerOff(), bell(), sendVoice(), receiveVoice(), hangup()
			DmbCellPhone 클래스[자식]	<DmbCellPhone extends CellPhone>
 			- 필드 : channel
 			- 메소드 : turnOnDmb(), changeChannelDmb(), turnOffDmb()
			객체 생성:
 			DmbCellPhone dmb = new DmbCellPhone(); <= 객체 생성
		 */
		DmbCellPhone dmbp = new DmbCellPhone("아이폰","블랙", 10);
		
		System.out.println("모델: " + dmbp.model);
		System.out.println("색상: "+dmbp.color);
		System.out.println("채널: "+dmbp.channel);
		//부모 클래스의 메소드
		dmbp.powerOn();
		dmbp.bell();
		dmbp.sendVoice("여보세요");
		dmbp.receiveVoice("안녕하세요");
		dmbp.sendVoice("반가워요");
		dmbp.hangUp();
		//자식 클래스의 메소드
		dmbp.turnOnDmb();
		dmbp.changeChannelDmb(22);
		dmbp.turnOffDmb();
	}

}
