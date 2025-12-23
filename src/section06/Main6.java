package section06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }

        list.sort(Comparator.naturalOrder());

        int[] answer = new int[2];
        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != list.get(i)) {
                answer[index] = i+1;
                index++;
            }
        }

        for(int i: answer) System.out.print(i + " ");
    }
}
