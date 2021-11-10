import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String str[] = {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		boolean run=true;
		while(run){
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보! >> ");
			String user = sc.next();
			if(str[n].equals(user)) {
				System.out.println("사용자 = "+user+", 컴퓨터="+str[n]+" 비겼습니다.");
			}else if(user.equals("바위")) {
				System.out.println(str[n]==str[0]?"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 이겼습니다."
						:"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
			}
			else if(user.equals("가위")) {
				System.out.println(str[n]==str[2]?"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 이겼습니다."
						:"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
			}
			else {
				System.out.println(str[n]==str[1]?"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 이겼습니다."
						:"사용자 = "+user+" 컴퓨터 = "+str[n]+" 사용자가 졌습니다.");
			}
			if(user.equals("그만")){
				System.out.println("게임을 종료합니다...");
				run=false;
				
			}
			
		}
		sc.close();
	}
}
