package interface_08.lab02_scheduler;

import java.util.Scanner;

public class SchedulerEx2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 가장 높은 고객 먼저 할당");
		boolean run = true;
		while(run) {
			Scheduler scheduler = null;
			System.out.print("선택하세요 >> ");
			String choice = sc.next();
			
			if (choice.equals("R") || choice.equals("r")) {
				scheduler = new RoundRobin();
				print(scheduler);
			} else if (choice.equals("L") || choice.equals("l")) {
				scheduler = new LeastJob();
				print(scheduler);
			} else if (choice.equals("P") || choice.equals("p")) {
				scheduler = new PriortiyAllocation();
				print(scheduler);
			}else if(choice.equals("그만")) {
				run = false;
				System.out.println("종료합니다.");
				break;
			}else{
				System.out.println("지원되지 않는 기능입니다.");
			}	
		}
		sc.close();
	}
	public static void print(Scheduler s) {
		s.getNextCall();
		s.sendCallToAgent();
	}
}
