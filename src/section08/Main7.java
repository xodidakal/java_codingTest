package section08;

import java.util.Scanner;

public class Main7 {
    static int n, r;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        r = in.nextInt();

        Main7 T = new Main7();
        System.out.println(T.DFS(n,r));
    }

    int[][] dy = new int[35][35];
    public int DFS(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
}
