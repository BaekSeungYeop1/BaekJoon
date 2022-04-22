package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1002 {

	public static void main(String[] args) throws IOException{
		/*
		 * 1. 원이 두 점에서 만나는 경우 r2 - r1 < d < r1 + r2
		 * 2. 두 원이 외접하는 경우 (한점에서 만난다)  d = r1 + r2
		 * 3. 두 원이 내접하는 경우 (한점에서 만난다) d = r2 - r1 or d != 0
		 * 4. 하나의 원이 다른 원을 포함하는 경우 (만나지 않는다) d < r2 - r1
		 * 5. 두 원이 멀리 떨어져 만나지 않는 경우 d > r1 + r2
		 * 6. 두 원이 일치하는 경우 (무수히 많은 점에서 만난다) d = 0  r1 = r2
		 * 출처: https://eine.tistory.com/entry/백준저지-1002번-터렛-문제-풀이 [아인스트라세의 SW 블로그]
		 * 
		 * 
		 * 
		 */

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 
		int T = Integer.parseInt(br.readLine());
 
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
 
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			System.out.println(point(x1, y1, r1, x2, y2, r2));
	}

}

	private static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		// 중점간 거리 distance의 제곱
		int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		
		// case 1 : 중점이 같으면서 반지름도 같을 경우 (무수히 많은 점)
		if(x1 == x2 && y1 == y2 && r1 == r2) {	
			return -1;		
		}
		
		// case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때 (접점 0개)
		else if(distance > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		// case 2-2 : 원 안에 원이 있으나 내접하지 않을 때 (접점 0개)
		else if(distance < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		// case 3-1 : 내접할 때 (접점 1개)
		else if(distance == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		
		// case 3-2 : 외접할 때 (접점 1개)
		else if(distance == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
 	}
}
