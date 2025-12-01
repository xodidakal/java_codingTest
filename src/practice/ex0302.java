package practice;

import java.util.*;

public class ex0302 {
    public static void main(String[] args) {
        // 공통원소 구하기
        // 핵심! 두개의 배열이 주어지는데 배열의 길이는 각각 최대 3만개가 될 수 있다.
        // 이때 이중 for문을 돌리게 되면 시간 복잡도는 O(n^2) 가 되기 때문에
        // Time Limit Error 가 발생할 수 있다.
        // 따라서 최대한 O(n) 으로 구하는게 핵심이다.

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        Set<Integer> input1 = new HashSet<>(); // hashset 은 contains 로 특정 값을 찾을 때 해시코드를 사용하기 떄문에 빠르다

        for(int i=0; i<A; i++) input1.add(in.nextInt());

        int B = in.nextInt();
        Set<Integer> answer = new TreeSet<>();

        for(int i=0; i<B; i++){
            int num = in.nextInt();
            if(input1.contains(num)){
                answer.add(num);
            }
        }

        for(int i : answer) System.out.print(i+ " ");
    }
}
