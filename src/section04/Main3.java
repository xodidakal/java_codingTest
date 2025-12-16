package section04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 슬라이드 윈도우 활용
        // HashMap을 활용하여 첫번째 연속되는 K개까지
        // 20(2개) 12(1개) 10(1개) 개수를 구한다.
        // 이후 슬라이딩 윈도우를 활용하여 연속되는 배열을 구할 때
        // 중간값은 중복되기 때문에 제외하고
        // 첫번째 값은 map 에서 개수를 -1하고 연속되는 마지막 값은 map에 비교하여 값이 있으면 +1 없으면 1로 키를 추가한다.
        // 만약 첫번째 값을 -1하면서 개수가 0이라면 아예 map 에서 삭제한다.
        // map의 size(key의 개수) 가 곧 매출액의 종류이다
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = in.nextInt();

        for(int i = 0; i < K; i++) {
            map.merge(arr[i], 1, Integer::sum);
        }
        System.out.print(map.size());

        for(int i = 1; i <= N-K; i++) {
            map.merge(arr[i-1], -1, Integer::sum);
            if(map.get(arr[i-1]) == 0) map.remove(arr[i-1]);
            map.merge(arr[i+K-1], 1, Integer::sum);
            System.out.print(" "+map.size());
        }
    }
}
