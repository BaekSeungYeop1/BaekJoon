package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon3009 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		 * (5,5),(5,7),(7,5)
		 *
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] x = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		
		st = new StringTokenizer(br.readLine()," ");
		int[] y = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		
		st = new StringTokenizer(br.readLine()," ");
		int[] z = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		
		int a;
		int b;
		
		if(x[0]==y[0]) {
			a = z[0];
		}
		else if(y[0]==z[0]) {
			a = x[0];
		}
		else {
			a = y[0];
		}
		
		if(x[1]==y[1]) {
			b = z[1];
		}
		else if(y[1]==z[1]) {
			b = x[1];
		}
		else {
			b = y[1];
		}
		
		System.out.print(a + " " + b);
		

	}

}
