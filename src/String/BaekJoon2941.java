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
			
			if(s.contains(str[i])) {		//s ���ڿ����� str�� �ִ� ���ڵ��� �ִ��� �˻� true,false ��ȯ
				s = s.replace(str[i],"0");  // true�� ã�� ���� "0"���� ����
				
			}
			
		}
		System.out.print(s.length());
	}

}
