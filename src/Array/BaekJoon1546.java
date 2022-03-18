package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon1546 {

	public static void main(String[] args) throws IOException{
		// �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
		// �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. 
		// �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		// ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
		// �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		// Scanner
		/*
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i< arr.length; i++) {
			sum += ((arr[i]/arr[arr.length-1])*100);
		}
		System.out.println(sum/arr.length);
		*/
		
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0 ; i<arr.length; i++) {
			sum += ((arr[i]/arr[arr.length-1])*100);
		}
		System.out.println(sum/arr.length);
	}

}
