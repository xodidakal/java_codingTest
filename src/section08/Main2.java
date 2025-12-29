package section08;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        int sum = 0;

        DFS(0, sum, arr, n, c);
        System.out.println(totalSum);
    }

    static int totalSum = 0;

    public static void DFS(int L, int sum, int[] arr, int n, int c){
        // 재귀 함수는 스택구조이기 때문에 return을 한다고 해도 재귀함수가 완전히 종료되는 것이 아닌
        // 현재 실행중인 DFS 호출 1개만 종료된다.
        // 나머지 DFS는 계속 실행중
        if(sum > c) return;
        if(L==n) {
            // void 이기 때문에 더이상 실행할 코드가 없으면 totalSum의 최대값을 담고 함수 종료
            if(sum <= c) totalSum = Math.max(totalSum, sum);
        }
        else {
            DFS(L+1, sum + arr[L], arr, n, c);
            DFS(L+1, sum, arr, n, c);
        }
    }


}
