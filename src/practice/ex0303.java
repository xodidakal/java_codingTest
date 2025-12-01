package practice;

import java.util.*;

public class ex0303 {
    public static void main(String[] args) {
        // 최대 매출
        // 핵심 : 슬라이딩 윈도우 기법을 활용
        // 마찬가지로 N이 최대 10만 이기 때문에 연속된 숫자를 구하기 위해서
        // 이중 for문을 돌리게 되면 최대 O(n^2) 의 시간복잡도가 발생한다.
        // 슬라이딩 윈도우는 for문을 한번만 돌릴 수 있는 기법이다.
        // 예를 들어 배열의 길이인 N 이 10 이고 연속된 일수인 K가 3이라고 하자
        // 배열은 12 15 11 20 25 10 20 19 13 15 이라고 할 때
        // 첫번째 3일 연속된 값의 합은 12+15+11 = 38이 된다.
        // 두번째 3일 연속된 값의 합은 15+11+20 = 46이 된다.
        // 첫번쨰와 두번째의 차이는 첫번째 합에서 12를 빼고 20을 더했다는 것이다.
        // 이를 코드화 하면 이중포문을 돌지 않아도 연속된 합을 구할 수 있다.
        // 슬라이딩 윈도우 기법은 주로 연속되는 범위가 고정되어 있을 때 사용하면 된다.

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = in.nextInt();

        int sum = 0;
        for(int i=0; i<K; i++) sum += arr[i];
        int max = sum;

        for(int i=1; i <= N-K; i++) {
            sum = sum - arr[i-1] + arr[i+K-1];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
