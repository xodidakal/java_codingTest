package section04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++) arr[i] = in.nextInt();

        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i =0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        answer = Tset.stream().skip(k-1).findFirst().orElse(-1);
        System.out.println(answer);


    }
}
