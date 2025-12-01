package section02;

import java.util.*;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] input = new int[t];
        int[] answer = new int[t];

        for(int i=0; i<t; i++) {
            input[i] = in.nextInt();
        }

        // 내가 짠 코드 -> 등수는 구하나 동일한 점수일 경우 같은 등수를 매겨야하는데
        // 같은 등수로 매겨주지 않는다.
        // List<Integer> list = new ArrayList<>();
        // for(int i=0; i<t; i++) {
        //     input[i] = in.nextInt();
        //     list.add(input[i]);
        // }

        // list.sort(Comparator.reverseOrder());

        // for(int i=0; i<list.size(); i++){
        //     for(int j=0; j<input.length; j++){
        //         if(list.get(i) == input[j]) answer[j] = i+1;
        //     }
        // }

        // for(int i : answer) System.out.print(i+" ");

        // 강사님 답변
        // 생각보다 간단했다
        // 이중 포문을 돌려서 나의 점수와 다른 사람의 점수를 차례대로 비교하여
        // 나보다 점수가 높은 사람이 있다면 나의 등수는 하나 밀려나기 때문에
        // coun++를 해주면 된다.
        // 동일한 점수일 경우도 다른 사람들과 비교했을 때 똑같은 등수가 나온다.
        for(int i=0; i<input.length; i++) {
            int count = 1;
            for (int j = 0; j<input.length; j++) {
                if(input[i] < input[j]) count++;
            }
            answer[i] = count;
            System.out.print(answer[i]+ " ");
        }
    }
}
