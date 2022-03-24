package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String str[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		
		
		for(int i = 0; i<str.length; i++) {
			
			if(s.contains(str[i])) {		//s 문자열에서 str에 있는 문자들이 있는지 검사 true,false 반환
				s = s.replace(str[i],"0");  // true면 찾은 문자 "0"으로 변경
				
			}
			
		}
		System.out.print(s.length());
	}

}
