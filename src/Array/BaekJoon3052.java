package Array;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon3052 {
	public static void main(String args[]) {
		// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
		// 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
		// 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
		// Scanner 배열 사용
		/*
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[42];
		
		int n;
		int count=0;
		
		for(int i = 0; i<10; i++) {
			n = sc.nextInt();
			
			if(!check[n%42]) {
				count ++;
				check[n%42] = true;
			}
		}
		System.out.println(count);
		*/
		
		// Scanner HashSet 사용
		// HashSet(자바 컬렉션 중 Set의 파생 클래스) : 중복되는 원소를 넣을 경우 하나만 저장 + 순서 개념 x
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0 ; i< 10; i++) {
			h.add(sc.nextInt() % 42);
			// 입력받은 값의 나머지 값을 add 메소도를 통해 HashSet에 저장
		}
		sc.close();
		System.out.print(h.size());
		//HashSet.size() 는 HashSet 의 크기(= 저장되어 있는 원소의 개수)를 반환
	}

}
