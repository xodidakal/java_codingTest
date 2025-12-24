package section06;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        // 결정 알고리즘 : 이진 탐색을 통해 문제를 해결하는 방법론
        // 입력값이 1 2 3 4 5 6 7 8 9 라고 가정했을 때
        // DVD 용량의 최소의 값 : 9 (항목중 제일큰값)
        // DVD 용량의 최대의 값 : 45 (다더한값)
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();

        int answer = 0;
        // 용량이 9~45 중에 DVD 3개로 노래를 나눠서 담을 수 있는 최소 용량을 구하라
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(count(arr, mid) <= m){
                answer = mid;
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }

        System.out.println(answer);
    }

    // 특정 용량으로는 몇장의 DVD가 필요한지 구하는 메소드
    public static int count(int arr[], int capacity){
        int cnt = 1, sum = 0; // DVD 장수
        for(int x : arr){
            if( sum+x > capacity){
                cnt++;
                sum = x;
            }else sum += x;
        }
        return cnt;
    }
}
