package section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //Queue 사용
        // q.offer(x) : 큐에 값 삽입
        // q.peek() : 큐의 값 확인
        // q.poll() : 큐의 값을 확인하고 제거

        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++) queue.offer(i);

        int answer = 0;
        //큐가 비어있지 않을때가지 무한루프
        while (!queue.isEmpty()) {
            for(int i = 1; i<k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }
        System.out.println(answer);

    }
}
