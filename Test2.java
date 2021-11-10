import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		boolean b = true;
		long allCnt;
		long n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
		Random random = new Random();
		DecimalFormat df;

		while (b) {
			System.out.print("주사위 던지고 싶은 횟수 >> ");
			Scanner sc = new Scanner(System.in);
			allCnt = sc.nextLong();
			df = new DecimalFormat("#,###");

			System.out.println(df.format(allCnt) + "회를 지정했습니다.");

			if (allCnt >= 100000000) {
				System.out.println("1억회 이상은 시간이 지나치게 소모될 수 있습니다.");
			}
			System.out.print("지정한 횟수만큼 주사위를 던지려면 'y'를 입력하세요, 중단을 원하면 'Ctrl+c를 누르세요 >> ");
			String strTmp = sc.next();
			long startTime, endTime;
			if (strTmp.equals("y") || strTmp.equals("Y")) {
				startTime = System.currentTimeMillis();
				for (long i = 1; i <= allCnt; i++) {
					int n = random.nextInt(6) + 1;
					switch (n) {
					case 1:
						n1++; break;
					case 2:
						n2++; break;
					case 3:
						n3++; break;
					case 4:
						n4++; break;
					case 5:
						n5++; break;
					case 6:
						n6++; break;
					}
				}
				endTime = System.currentTimeMillis();
				System.out.println("\n주사위 던진 횟수는 " + df.format(allCnt) + "입니다.\n");
				System.out.println("1 횟수: " + n1 + " 1확률: " + n1 / (double) allCnt);
				System.out.println("2 횟수: " + n2 + " 2확률: " + n2 / (double) allCnt);
				System.out.println("3 횟수: " + n3 + " 3확률: " + n3 / (double) allCnt);
				System.out.println("4 횟수: " + n4 + " 4확률: " + n4 / (double) allCnt);
				System.out.println("5 횟수: " + n5 + " 5확률: " + n5 / (double) allCnt);
				System.out.println("6 횟수: " + n6 + " 6확률: " + n6 / (double) allCnt);

				System.out.println("\n주사위 한면이 나올 확률은 " + 1.0 / 6 + "입니다.");
				System.out.println("소요시간은 " + (endTime - startTime) / 1000.0 + "초입니다.");
				sc.close();
				b = false;
			} else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}

	}
}
