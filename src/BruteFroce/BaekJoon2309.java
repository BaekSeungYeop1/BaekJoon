package BruteFroce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int[] arr = new int[9];
		int fakeA = 0;
		int fakeB = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(100 == sum -(arr[i]+arr[j])) {
					fakeA = arr[i];
					fakeB = arr[j];
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) { 
			if(arr[i] == fakeA || arr[i] == fakeB) 
				continue;
			System.out.println(arr[i]);
		}
	}

}
