package section02;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] input = new int[t];

        for(int i=0; i<t; i++) {
            input[i] = in.nextInt();
        }

        int[] answer = new int[t];

        for(int i = 0; i<input.length; i++) {
            if(input[i] == 1) {
                answer[i] += 1;
                if(i != 0 && input[i-1] == 1) answer[i] = answer[i-1] +1;
            }
        }

        int result = 0;
        for(int i:answer) {
            result += i; }

        System.out.println(result);
    }
}
