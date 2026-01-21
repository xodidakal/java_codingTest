package section08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main5 {
    static int n, m, answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Integer[] arr = new Integer[n];

        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        m = in.nextInt();

        // 내가 푼 방식 : 그리디 방식
        // 가장 큰 수부터 나누어서 개수를 구하는 방식이였으나 그럼 최소개수를 보장할 수 없음
        // 예로
        // 5
        // 1 8 20 25 50
        // 129
        // 이라는 값을 받았을 때 내가 푼 방식으로는 7개가 출력되지만
        // 실제 최소개수는
        // 50 × 2 = 100
        // 20 × 1 = 20
        // 8 × 1  = 8
        // 1 × 1  = 1
        // 총 5개가 나올 수 있다.
        // 따라서 이 방법으로 가면 정확한 답이 안나올수있다는 문제점이 있다.
        // arr.sort(Comparator.reverseOrder());
        // int answer = 0;
        // for(int num : arr) {
        //     int mok = m / num;
        //     int nam = m % num;
        //     if(nam == 0) {
        //         answer += mok;
        //         System.out.println(answer);
        //         return;
        //     } else if (mok == 0) {
        //         continue;
        //     } else {
        //         answer += mok;
        //         m = nam;
        //     }
        // }

        // DP(동적 계획법) 으로 풀어야 정답이 나옴
        Arrays.sort(arr, Collections.reverseOrder());
        Main5 T = new Main5();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    public void DFS(int L, int sum, Integer[] arr){
        if(sum > m) return;
        if(L > answer) return;
        if(sum == m) {
            answer = Math.min(answer, L);

        }else {
            for(int num : arr) {
                DFS(L+1, sum+num, arr);
            }
        }
    }
}
