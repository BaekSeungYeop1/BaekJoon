package For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon10871 {
	public static void main(String args[]) throws IOException{
		//���� N���� �̷���� ���� A�� ���� X�� �־�����. 
		//�̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//Scanner �迭 O
		/*
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int X = sc.nextInt();
		int arr[] = new int[A];
		
		for(int i= 0; i<A; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<A; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i] + " ");
			}
		}
		*/
		
		// Scanner �迭x
		/*
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int X = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<A; i++) {
			
			int value = sc.nextInt();
			if(value<X) {
				sb.append(value+ " ");
			}
		}
		System.out.println(sb);
		*/
		
		//BufferedReader �迭x
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<A; i++) {
			
			int value = Integer.parseInt(st.nextToken());
			if(value<X) {
				sb.append(value).append(" ");
			}
		
		
		}
		System.out.println(sb);
		
	}
}
