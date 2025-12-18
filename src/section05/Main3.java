package section05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];
        for(int i =0; i < n; i++) {
            for(int j = 0; j<n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i =0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        List<Stack<Integer>> board = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            board.add(new Stack<>());
        }

        for(int i = 0; i < n; i++) {
            for(int j = n-1; j >=0; j--) {
                board.get(i).push(arr[j][i]);
            }
        }

        int answer = 0;

        for(int i=0; i < m; i++) {
            int pos = moves[i] -1;

            while(!board.get(pos).isEmpty() && board.get(pos).peek() == 0) {
                board.get(pos).pop();  // 0 버림
            }

            if(!board.get(pos).isEmpty()){
                int doll = board.get(pos).pop();

                if(!stack.isEmpty() && stack.peek() == doll) {
                    stack.pop();
                    answer += 2;
                }else {
                    stack.push(doll);
                }

            }
        }

        System.out.println(answer);
    }
}
