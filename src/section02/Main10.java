package section02;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[][] input = new int[t+2][t+2];

        for(int i=1; i<t+1; i++){
            for(int j=1; j<t+1; j++){
                input[i][j] = in.nextInt();
            }
        }

        int answer = 0;
        for(int i=1; i<t+1; i++){
            for(int j=1; j<t+1; j++){
                if(input[i][j] > input[i-1][j] //상
                    && input[i][j] > input[i+1][j] //하
                    && input[i][j] > input[i][j-1] //좌
                    && input[i][j] > input[i][j+1] )//우
                {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
