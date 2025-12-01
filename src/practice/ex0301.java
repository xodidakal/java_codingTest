package practice;

import java.util.*;

public class ex0301 {
    public static void main(String[] args) {
        // 03-01. 두 배열 합치기
        Scanner in = new Scanner(System.in);
        List<Integer> answer = new ArrayList<>();

        int n = in.nextInt();
        for(int i = 0; i<n; i++) answer.add(in.nextInt());

        int M = in.nextInt();
        for(int i = 0; i<M; i++) answer.add(in.nextInt());

        answer.sort(Comparator.naturalOrder());

        for(int i=0; i<n+M; i++) System.out.print(answer.get(i)+" ");


    }
}
