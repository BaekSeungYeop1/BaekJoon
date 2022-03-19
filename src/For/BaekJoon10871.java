package For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon10871 {
	public static void main(String args[]) throws IOException{
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
		//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		//Scanner 배열 O
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
		
		// Scanner 배열x
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
		
		//BufferedReader 배열x
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
