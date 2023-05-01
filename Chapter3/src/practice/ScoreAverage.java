package practice;

import java.util.Scanner;

public class ScoreAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double sum = 0;
		
		for(int i = 0; i<score.length; i++) {
			for(int j=0; j<score[0].length; j++) {
				sum += score[i][j];
			}
		}
		
		System.out.println("4년 전체 평점 평균은 " + sum /(score.length*score[0].length));}

}
