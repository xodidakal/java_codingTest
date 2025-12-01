package section02;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt(); // 반 학생수
        int M = in.nextInt(); // 수학 시험 횟수

        int[][] input = new int[M][n];

        for(int i=0; i<M; i++){
            for(int j=0; j<n; j++){
                input[i][j] = in.nextInt();
            }
        }

        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int count = 0;
                for(int k=0; k<M; k++){
                    int pi = 0;
                    int pj = 0;
                    for(int s=0; s<n; s++){
                        if(input[k][s] == i) pi = s;
                        if(input[k][s] == j) pj = s;
                    }
                    if(pi < pj) count++;
                }
                if(count == M) answer++;
            }
        }

        System.out.println(answer);
    }
}
