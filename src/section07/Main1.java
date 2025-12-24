package section07;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //상태트리탐색
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        int me = s;
        int answer = 0;

        while (me != e) {
            int diff = e - me;

            if(diff >= 5) {
                me += 5;
                answer++;
            }
            else if(diff > 0 && diff < 5) {
                if(diff == 4) {
                    answer += 2;
                } else {
                    answer += diff;
                }
                me = e;
            }
            else if(diff < 0) {
                answer += Math.abs(diff);
                me = e;
            }
        }

        System.out.println(answer);
    }
}
