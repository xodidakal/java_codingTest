package section08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<int[]> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int[] arr = new int[2];
            for(int j=0; j<2; j++){
                arr[j] = in.nextInt();
            }
            list.add(arr);
        }

        int time = 0;
        int sum = 0;
        DFS(0, time, sum, list, n, m);

        System.out.println(totalSum);
    }

    static int totalSum = 0;

    public static void DFS(int L, int time, int sum, List<int[]> list, int n, int m){
        if(time > m) return;
        if(L==n){
            totalSum = Math.max(totalSum, sum);
        }else {
            DFS(L+1, time + list.get(L)[1], sum + list.get(L)[0], list, n, m);
            DFS(L+1, time, sum, list, n, m);
        }
    }
}
