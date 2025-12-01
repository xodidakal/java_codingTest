package section03;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n-1; i++) arr[i] = in.nextInt();

        int answer = 0;
        int cnt = 0; // 0 -> 1 변경한 횟수 (k를 넘지 않아야 한다.)
        int lt = 0;
        int max = 0;

        // rt 를 증가시키면서 0인 곳을 찾는다.
        // 0을 만났을 때 0->1로 변경하는 횟수를 증가시킨다.
        // 그리고 만약 증가를 시켰는데 최대 변경 가능횟수보다 커졌다면
        // cnt가 최대변경 가능횟수보다 작아질 때까지 while 문을 돌려 lt를 증가시킨다.
        // 이때 lt가 0을 만났다면 cnt를 감소시키고 다시 전진한다.
        // 그리고 cnt가 다시 k보다 작아졌다면 while 문을 빠져나와 현재의 길이를 구한다.
        // 길이는 끝 인덱스 - 처음 인덱스 + 1 이므로 반복문을 돌면서 max 값을 구한다.
        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while (cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        System.out.println(answer);
    }
}
