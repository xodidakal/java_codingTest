package section02;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[][] input = new int[t][t];

        for(int i=0; i<t; i++){
            for(int j=0; j<t; j++){
                input[i][j] = in.nextInt();
            }
        }

        // 행열기준 최고값
        int max = 0;
        for(int i=0; i<t; i++){
            int sumRow = 0;
            int sumColumn = 0;

            for(int j=0; j<t; j++){
               sumRow += input[i][j];
               sumColumn += input[j][i];
            }

            max = Math.max(max, sumRow); // 행의 값중 최고값
            max = Math.max(max, sumColumn); // 행의 값중 최고값과 비교하여 행과 열의 값중 최고값
        }

        // 대각선
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<t; i++) {
            int rt = t-1;
            sum1 += input[i][i];
            sum2 += input[i][rt];
            rt--;
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        System.out.println(max);
    }
}
