package String;

import java.util.Scanner;

public class BaekJoon10809 {

	public static void main(String[] args) {
		// ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����
		// ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��,
		// ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		// �迭�� ���� ��� -1�� �ʱ�ȭ
		for(int i =0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String s = sc.next();
		
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(arr[ch - 'a']  == -1){
				arr[ch - 'a']= i;
			}
		}
		for(int value : arr) {
			System.out.print(value+ " ");
		}
		

		// indexof()
		/*
		Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        for (char c = 'a' ; c <= 'z' ; c++) {
            System.out.print(word.indexOf(c) + " ");
            }
            */
	}

}
