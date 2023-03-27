package lecture;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4}, // 1학년 1, 2학기 평점
							{3.5, 3.6}, // 2학년 1, 2학기 평점
							{3.7, 4.0}, // 3학년 1, 2학기 평점
							{4.1, 4.2} }; // 4학년 1, 2학기 평점

		double sum = 0;
		int year = score.length; //행의 값
		int term = score[0].length; //열의 값
		
		for(int i=0; i<year; i++) {
			for(int j=0; j<term; j++) {
				sum += score[i][j];
			}
		}		
		System.out.println("4년 전체 평점 평균은 " + sum/(year*term));
	}

}
