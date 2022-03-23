package String;

import java.util.Scanner;

public class BaekJoon10809 {

	public static void main(String[] args) {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다
		// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
		// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		// 배열의 값을 모두 -1로 초기화
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
