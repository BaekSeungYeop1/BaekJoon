package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon3053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int R = Integer.parseInt(br.readLine());
		
		double euclideanGeometry = Math.PI * R * R;
		double taxiCabGeometry = 2 * R * R;
		
		System.out.println(euclideanGeometry);
		System.out.println(taxiCabGeometry);

	}

}
