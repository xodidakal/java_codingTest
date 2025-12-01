package practice;

import java.util.Scanner;

public class ex0304 {
    public static void main(String[] args) {
        // 연속 부분수열
        // 핵심 : 투 포인터를 사용하라 lt, rt
        // 연속된 수의 합을 구하는 문제에서 범위가 고정되어 있지 않고 동적으로 변하는 경우에는
        // lt와 rt 라는 배열의 포인터를 사용하여 범위를 늘렸다가 줄였다가 동적으로 변경한다.
        // rt는 계속 늘려가고 만약 연속된 숫자 합이 특정숫자와 동일해지면 카운트를 늘리고
        // 특정숫자보다 크다면 rt는 전진을 멈추고 lt를 앞으로 전진한다.
        // 이때 lt는 전진하면 이전 lt 값을 sum에서 빼면서 sum이 특정숫자보다 크기가 작아질 때까지 루프를 돌린다.

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) arr[i] = in.nextInt();

        int sum = 0; // 특정숫자와 같아져야 하는 합
        int cnt = 0; // 특정숫자와 연속되는 수가 몇번 같은지 세는 수
        int lt =0;   // 연속된 숫자의 처음이 되는 인덱스

        for(int rt= 0; rt < N; rt++){
            sum += arr[rt];
            if(sum == M) cnt++;
            while (sum >= M) {
                sum -= arr[lt++]; // lt++는 후위 연산자로 sum -= arr[lt]가 먼저 계산되고 lt+1이 된다.
                if(sum == M) cnt++;
            }
        }

        System.out.println(cnt);

    }
}
