package FibonacciNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9507 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		long[] arr = new long[69];
		
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int i=4; i<68; i++) {
			arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3] + arr[i - 4];
		}
		
		for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }
		

	}
	


}
