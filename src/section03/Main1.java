package section03;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1 = in.nextInt();
        int[] input1 = new int[n1];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n1; i++) {
            input1[i] = in.nextInt();
            list.add(input1[i]);
        }

        int n2 = in.nextInt();
        int[] input2 = new int[n2];

        for(int i=0; i<n2; i++) {
            input2[i] = in.nextInt();
            list.add(input2[i]);
        }

        int[] answer = new int[n1+n2];

        list.sort(Comparator.naturalOrder());

        for(int i=0; i<n1+n2; i++) {
            answer[i] = list.get(i);
            System.out.print(answer[i]+" ");
        }



    }
}
