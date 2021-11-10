package Subject.Ydh0922;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise09 {
	static ArrayList<Student> student = new ArrayList<Student>();
	static int studentNum=0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//9번 문제
		boolean run =true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 >> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo==1) {
				System.out.print("학생수 > ");
				studentNum=sc.nextInt();
			}else if(selectNo==2) {
				if(studentNum ==0) {
					System.out.println("1번을 선택해서 학생수를 먼저 입력해주세요.");
				}else {
					input();
				}
			}else if(selectNo==3) {
				list();
			}else if(selectNo==4) {
				analyze();
			}else if(selectNo==5) {
				run =false;
			}else {
				System.out.println("다시 선택하세요.");
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
	static void input() {
		int score;
		String name;
		for(int i=0;i<studentNum;i++) {
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("점수입력: ");
		score = sc.nextInt();
		student.add(new Student(name,score));
		}
	}
	static void list() {
		for(int i=0;i<student.size();i++) {
			System.out.print("Student("+(i+1)+") : "+student.get(i).name+", "+student.get(i).score);
			System.out.println();
		}
	}
	static void analyze() {
		int max=0;
		int sum=0;
		double avg=0.0;
		Student m = null;
		for(int i=0;i<student.size();i++) {
			if(max<student.get(i).score) {
				max = student.get(i).score;
				m = student.get(i);
			}

			sum+=student.get(i).score;
		}
		avg=(double)(sum/student.size());
		System.out.println("최고 점수: "+max);
		System.out.println("최고 점수 학생: "+m.name);
		System.out.println("평균 점수: "+avg);
	}
}
