package InputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon3003 {

	public static void main(String[] args) throws IOException {
		
		int[] cnt = new int[6];
		int[] full = new int[] {1,1,2,2,2,8};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		for(int i = 0; i<6; i++) {
			cnt[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i<full.length; i++) {
			cnt[i] = full[i] - cnt[i];
			System.out.println(cnt[i]);
		}
		
	}

}
