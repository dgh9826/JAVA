package Object06.confirmtest;

import java.util.Scanner;

public class BankApplication {

	private static Account2[] accountArray = new Account2[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run =true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo= sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {

		 System.out.println("--------");
		 System.out.println("계좌생성");
		 System.out.println("--------");
		 System.out.print("계좌번호: ");
		 String ano=sc.next();
		 System.out.print("계좌주: ");
		 String owner=sc.next();
		 System.out.print("초기입금액: ");
		 int balance=sc.nextInt();
		 Account2 newaccount = new Account2(ano,owner,balance);
		 for(int i=0;i<accountArray.length;i++) {				//배열이 null값이면
			 if(accountArray[i]==null) {						//호출한 생성자를 배열에 저장
				 accountArray[i]=newaccount;
				 System.out.println("결과: 계좌가 생성되었습니다.");
				 break;
			 }
		 }
	}
	
	private static void accountList() {

		 System.out.println("--------");
		 System.out.println("계좌목록");
		 System.out.println("--------");
		 for(int i=0;i<accountArray.length;i++) {
			 Account2 account = accountArray[i];
			 if (account !=null) {								//배열이 널값이 아니면 
				 System.out.print(account.getAno()+"   ");		//계좌
				 System.out.print(account.getOwner()+"   ");	//계좌주
				 System.out.print(account.getBalance()+"   ");	//금액을 출력
				 System.out.println();
			 }
		 }
	}
	private static void deposit() {
		 System.out.println("--------");
		 System.out.println("예금");
		 System.out.println("--------");
		 System.out.print("계좌번호: ");
		 String ano=sc.next();
		 
		 Account2 account = findAccount(ano);
		 if(account == null) {						//findAccount 함수로 할당한 account변수가 null값이면 출력
			 System.out.println("계좌가 없습니다.");
			 return;
		 }
		 System.out.println("예금액: ");
		 int money = sc.nextInt();
		 account.setBalance(account.getBalance()+money);	//findAccount함수로 할당한 account변수에서 잔액을 변경
		 System.out.println("예금이 성공되었습니다.");
	}
	private static void withdraw() {
		 System.out.println("--------");
		 System.out.println("출금");
		 System.out.println("--------");
		 System.out.print("계좌번호: ");
		 String ano=sc.next();
		 
		 Account2 account = findAccount(ano);
		 if(account == null) {
			 System.out.println("계좌가 없습니다.");
			 return;
		 }
		 System.out.println("출금액: ");
		 int money = sc.nextInt();
		 if(money > account.getBalance()) {
			 System.out.println("잔액이 부족합니다.");
		 }else {
			 account.setBalance(account.getBalance()-money);
			 System.out.println("출금이 성공되었습니다.");
			 //System.out.println("현재 금액: "+account.getBalance());
		 }
	}
	private static Account2 findAccount(String ano) {		//return값이 Account2인 method
		Account2 account = null;
		for(int i=0;i<accountArray.length;i++) {			
			if(accountArray[i]!=null) {						//accountArray 값이 null 이 아니면
				String arrano = accountArray[i].getAno();	//배열의 계좌문자열을 불러오고
				if(arrano.equals(ano)) {				//불러온 계좌주와 값이 같으면 배열 저장
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}