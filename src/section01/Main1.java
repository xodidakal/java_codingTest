package section01;

import java.util.Scanner;

public class Main1 {
    public static int solution(String str, char t){
        int answer = 0;

        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1 t = new Main1();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(t.solution(input1, input2));
    }

}
