package section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<n; i++) {
            int num = in.nextInt();
            arr[i] = num;
            q.offer(new int[]{num, i});
        }

        boolean condition = true;
        int answer = 0;

        while (condition) {
            int[] current = q.poll();
            int num = current[0];
            int idx = current[1];

            if(q.stream().anyMatch(item -> num < item[0])) {
                q.offer(current);
            }else {
                answer++;
                if(idx == m) condition = false;
            }
        }

        System.out.println(answer);

    }
}
