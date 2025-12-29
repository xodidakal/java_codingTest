package section08;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 합이 같은 부분집합 (DFS)
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int total = 0;
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }

        int sum = 0;

        DFS(0, sum, arr, n, total);
        System.out.println(flag ? "YES" :"NO");

    }

    static boolean flag = false;

    // 재귀 함수 활용
    public static void DFS(int L, int sum, int[] arr, int n, int total){

        // 부분함수 합이 total/2의 값과 같으므로 함수를 빠져나옴
        if(flag) return;

        // 부분합수 두개의 합이 같을려면 배열 값의 총합 / 2 와 한개의 부분함수 값이 같으면 된다.
        // total/2 를 초과한다면 더이상 찾을 필요 없음
        if(sum > total/2) return;

        // 모든 원소에 대해 선택/비선택 결정이 끝난상태
        // 부분집합이 완전히 결정된 상태일 떄에만 flag 설정
        if(L==n){
            if((sum * 2)==total){
                flag = true;
            }
        }else {
            // 가지치기 (부분함수에 다음 인덱스값을 포함하거나 포함하지 않거나)
            // 다음 인덱스의 값을 합에 포함
            DFS(L+1, sum+arr[L], arr, n, total);
            // 다음 인덱스의 값을 합에 포함하지 않음
            DFS(L+1, sum, arr, n, total);
        }
    }
}
