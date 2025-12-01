package section02;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int classNum = 5;

        int[][] input = new int[t][classNum];

        int[] answer = new int[t];

        for(int i=0; i<t; i++){
            for(int j=0; j<classNum; j++){
                input[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < t; i++) { // i번 학생과
            int count = 0;
            for(int j=0; j < t; j++) { // j번 학생과
                for(int k=0; k< classNum; k++) { // 학년의 반을 비교
                    if (input[i][k] == input[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            answer[i] = count;
        }

        int max = 0;
        int index = 0;
        for(int i=0; i<t; i++) {
            if(max < answer[i]) {
                max = answer[i];
                index = i+1;
            }
        }
        System.out.println(index);
    }
}
