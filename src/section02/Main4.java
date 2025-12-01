package section02;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();

        int[] answer = new int[t];
        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i < t; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        for(int num : answer) System.err.print(num + " ");
    }
}
