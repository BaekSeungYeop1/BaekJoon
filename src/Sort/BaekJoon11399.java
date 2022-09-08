package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11399 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sort(arr);
		solution(arr);
		
	
		
	}

	private static void solution(int[] arr) {
		int prev = 0;;
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += prev + arr[i];
			prev += arr[i];
		}
		System.out.print(sum);
		
	}

	private static void sort(int[] arr) {
		int temp;
		int minIndex;
		for(int i =0; i < arr.length-1; i++) {
			minIndex = i;
			for(int j =i+1; j<arr.length; j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
		}
		
		}
	}

