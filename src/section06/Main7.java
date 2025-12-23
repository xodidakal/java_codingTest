package section06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // List 사용
        // List<int[]> list = new ArrayList<>();

        // for(int i=0; i<n; i++) {
        //     int[] arr = new int[2];
        //     for(int j=0; j<2; j++) {
        //         arr[j] = in.nextInt();
        //     }
        //     list.add(arr);
        // }


        // list = list.stream().sorted(
        //     Comparator.comparing((int[] item)->item[0])
        //                 .thenComparing(item -> item[1])
        // ).collect(Collectors.toList());

        // for(int i=0; i<list.size(); i++) {
        //     int[] answer = list.get(i);

        //     System.out.print(answer[0] + " ");
        //     System.out.println(answer[1]);
        // }

        // int[] 사용
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (a,b) -> {
            if(a[0]==b[0]) return a[1] - b[1];
            return a[0]-b[0];
        });

        for(int i=0; i<n; i++) System.out.println(arr[i][0] + " " + arr[i][1]);
    }
}
