package section06;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        // 결정 알고리즘 : 이분 탐색
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        int answer = 0;

        Arrays.sort(arr);


        int start = 1; // 말사이의 거리 최소값
        int end = arr[n-1]; //말사이의 거리 최대값

        while (start <= end) {
            int mid = (start + end) / 2;

            // mid를 말사이의 거리로 했을때 몇마리의 말을 마구간의 배치할 수 있는지 카운트
            // 3마리의 말을 배치해야한다면 반드시 3마리 이상의 말을 마굿간에 배치할 수 있어야 한다.
            if(count(arr, mid) >= c){
                // 배치가 가능하다면 mid 값을 답에 넣는다.
                answer = mid;
                // 말의 거리의 최대값을 구해야하므로 범위를 더 늘렸을때도 가능한지 확인하기 위해
                // start를 변경한다.
                start = mid + 1;
            }
            // 만약 mid 거리로는 말의 배치가 불가능할 때
            // 말사이의 거리가 너무 넓은것이므로 말 사이의 거리를 줄이기 위해
            // end 값을 줄인다.
            else end = mid - 1;
        }

        System.out.println(answer);
    }

    public static int count(int arr[], int dist){
        int cnt = 1; //말 마리
        int target = arr[0]; // 비교할 마굿간의 위치

        for(int i=1; i<arr.length; i++){
            // 말사이의 거리가 원하는 값보다 크거나 같을때
            if(arr[i] - target >= dist )
            {
                // 해당 마굿간에 말을 배치
                cnt++;
                // 현재 마굿간으로 넣는다.
                target = arr[i];
            }
        }

        return cnt;
    }
}
