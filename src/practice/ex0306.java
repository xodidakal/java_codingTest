package practice;

import java.util.Scanner;

public class ex0306 {
    public static void main(String[] args) {
        // 최대 길이 연속부분수열
        // 핵심 : 동적 길이의 연속된 숫자를 구할 떄에는 투 포인터를 사용하라. lt, rt
        // 0과 1로 구성된 수열에서 연속적으로 1로만 구성된 최대 길이를 구하라
        // rt를 전진하면서 0을 만나면 1로 바꾸어 변경 횟수를 늘리고
        // 만약 실제 변경횟수가 최대변경가능횟수보다 커졌다면
        // lt를 전진하면서 0->l로 바뀐 부분을 마주했다면 다시 1->0으로 변경하여 변경 카운트를 줄인다.
        // 1로 이루어진 연속된 수열의 길이는 rt(끝인덱스) - lt(첫인덱스) + 1 이다.

        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 수열의 길이
        int K = in.nextInt(); // 최대 0-> 1 변경가능 횟수
        int[] arr = new int[N];

        for(int i=0; i < N; i++) arr[i] = in.nextInt();

        int cnt = 0;
        int lt = 0;
        int max = 0;

        for(int rt=0; rt < N; rt++){
            if(arr[rt] == 0) cnt++;
            while (cnt > K) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            max = Math.max(max, rt-lt+1);
        }

        System.out.println(max);
    }
}
