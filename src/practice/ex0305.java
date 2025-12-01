package practice;

import java.util.Scanner;

public class ex0305 {
    public static void main(String[] args) {
        // 연속된 자연수의 합
        // 핵심 : 연속된 숫자의 합이면 투 포인터를 사용하라 lt, rt
        // 배열이 따로 주어지진 않지만 정수 N이 되는 연속되는 자연수의 합이니
        // 배열 안의 숫자는 최대 N을 넘어가지 않을 것이다.
        // 다만 2개 이상의 연속된 자연수의 합이므로 int[N-1]으로 1~N-1까지의 값을 배열에 담고
        // rt로 전진하면서 sum 이 N과 일치하는지 확인 후 cnt를 센다.
        // sum이 N보다 크다면 sum에서 이전 lt의 값을 빼면서 N보다 작아질 때까지 루프를 돌린다.

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N-1];

        for(int i=0; i<N-1; i++) arr[i] = i+1;

        int sum = 0;
        int cnt = 0;
        int lt = 0;

        for(int rt=0; rt<N-1; rt++) {
            sum += arr[rt];
            if(sum == N) cnt++;
            while (sum >= N) {
                sum -= arr[lt++];
                if(sum == N) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
