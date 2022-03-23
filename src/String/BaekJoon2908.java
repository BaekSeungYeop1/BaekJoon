package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon2908 {

	public static void main(String[] args) throws IOException{
		//Scanner
		/*
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 
		 sc.close();
		 
		 a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		 b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		 
		 System.out.print(a > b ? a : b);
		 */
		 
		 //BufferedReader
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 StringTokenizer st = new StringTokenizer(br.readLine()," ");
		 
		 int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 
		 System.out.print(a > b ? a : b);
	}

}
