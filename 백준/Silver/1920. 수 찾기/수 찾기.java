import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


/*

  */
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine()," ");
        for (int i = 0; i<m; i++){
            int num = Integer.parseInt(st.nextToken());
            if (binarySearch(arr,num) >= 0){
                sb.append(1).append("\n");
            }
            else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int key){
        int lo = 0;                 // 왼쪽 끝 인덱스
        int hi = arr.length - 1;    // 오른쪽 끝 인덱스

        while (lo<=hi){
            int mid = (lo+hi)/2;    // 중간 위치

            // key 값이 중간 위치의 값보다 작을 경우
            if (key<arr[mid]){
                hi = mid-1;
            }
            // key 값이 중간 위치의 값보다 클 경우
            else if (key>arr[mid]){
                lo = mid+1;
            }
            // key 값이 중간 위치의 값이 같을 경우
            else {
                return mid;
            }

        }
        return -1;
    }
}