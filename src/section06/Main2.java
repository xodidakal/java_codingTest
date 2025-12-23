package section06;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 버블정렬
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        // 문제 : 13 7 11 5 23 15
        // 1회차 : 7 11 5 13 15 23
        // 2회차 : 7 5 11 13 15 23
        // 3회차 : 5 7 11 13 15 23
        for(int i = 0; i< n-1; i++) { // 여러번 반복
            for(int j = 0; j< n-1 -i; j++) { //인접한 값과 비교
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i : arr) System.out.print(i + " ");

    }
}
