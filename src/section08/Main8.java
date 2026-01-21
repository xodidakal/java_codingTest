package section08;

import java.util.Scanner;

public class Main8 {
    static int n, f;
    static int[] arr, p, ch;
    boolean flag = false;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();
        arr = new int[n];
        p = new int[n];
        ch = new int[n+1];

        Main8 T = new Main8();
        for(int i=0; i<n; i++) {
            arr[i] = T.DFS(n-1, i);
        }

        T.DFS2(0, 0);

    }

    int[][] dy = new int[10][10];
    public int DFS(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else {
            return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public void DFS2(int L, int sum) {
        if(flag) return;
        if(L==n) {
            if(sum == f) {
                for(int x: p) System.out.print(x + " ");
                flag = true;
            }
        }else {
            for(int i=1; i<=n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS2(L+1, sum+(p[L] * arr[L]));
                    ch[i]=0;
                }
            }
        }
    }
}
