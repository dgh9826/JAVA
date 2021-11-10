package array_05.twodemension;

public class ScoreAverage {

	public static void main(String[] args) {
		//2차원 배열로 한년의 각 학기별(1학기,2학기)로 성적을 저장 하고, 4년간 전체 평점 평균을 구함 
		double score[][] = { {3.3,3.4},		//1학년 1학기,2학기
							 {3.5,3.6},		//2학년 1학기,2학기
							 {3.7,4.0},		//3학년 1학기,2학기
							 {4.1,4.2} };	//4학년 1학기,2학기
		
		double sum=0;
		for(int year=0;year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				sum+=score[year][term];
			}
		}
		int row = score.length;
		int column = score[0].length;
		System.out.println("총합 :"+sum);
		System.out.println("평균은 :"+sum/(row*column));
	}

}
