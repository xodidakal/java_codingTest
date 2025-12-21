package section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        Queue<Character> queue = new LinkedList<>();

        for(char c : input1.toCharArray()) queue.offer(c);

        String answer = "";

        for(char c : input2.toCharArray()){
            if(queue.contains(c) && c == queue.peek()) {
                queue.poll();
            }
        }

        if(queue.isEmpty()) {
            answer = "YES";
        }else answer = "NO";

        System.out.println(answer);
    }


}
