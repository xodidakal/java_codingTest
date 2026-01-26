package section08;

import java.util.Scanner;

public class Main11 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board;
    static int answer = Integer.MAX_VALUE;
    static int path = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new int[8][8];
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                board[i][j] = in.nextInt();
            }
        }

        board[1][1] = 1;
        Main11 T = new Main11();
        T.DFS(1, 1);
        if(answer == Integer.MAX_VALUE) {System.out.println(-1); return;}
        System.out.println(answer);
    }

    public void DFS(int x, int y) {
        if(x==7 && y==7) {
            answer = Math.min(answer, path);
        }
        else {
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx>=1&& nx<=7 && ny>=1 && ny<=7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    path++;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                    path--;
                }
            }
        }
    }
}
