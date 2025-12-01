package section02;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] input = new int[t];

        for (int i = 0; i < t; i++){
            input[i] = in.nextInt();
        }

        StringBuilder answer = new StringBuilder();
        answer.append(String.valueOf(input[0])+ " ");

        for(int i = 1; i < input.length; i++) {
            // 자신의 앞수 -> 자신보다 이전의 수와 비교했을 때
            if(input[i] > input[i-1]) {
                answer.append(String.valueOf(input[i])+ " ");
            }
        }

        System.out.println(answer.toString());

    }
}
