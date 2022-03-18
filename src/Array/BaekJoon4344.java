package Array;

import java.util.Scanner;

public class BaekJoon4344 {

	public static void main(String[] args) {
		// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
		// 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		// 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
		// 이어서 N명의 점수가 주어진다
		// 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		int C = sc.nextInt();
		
		for(int i=0; i<C; i++) {
			int N =  sc.nextInt(); //학생수
			arr = new int[N];
			
			double sum = 0;  // 성적 누적합
			
			// 성적 입력
			for(int j = 0; j<N; j++) {
				int val = sc.nextInt(); //성적 입력
				arr[j] = val;
				sum += val;
			}
			
			double avg = (sum/N);
			double count = 0; // 평균넘는 학생 수 
			
			for(int j = 0; j<N; j++) {
				if(arr[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
		sc.close();

	}

}
