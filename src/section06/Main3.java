package section06;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //삽입정렬
        //N번째 키부터 이전키값들과 비교하여 본인보다 크면 한칸 옆으로 미룬다.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        // 11 7 5 6 10 9
        // 7 11 5 6 10 9
        // 5 7 11 6 10 9
        // 5 6 7 11 10 9
        // 5 6 7 10 11 9
        // 5 6 7 9 10 11
        for(int i=1; i<n; i++) {
            int num = arr[i];
            for(int j=i-1; j >= 0; j--){
                if(num < arr[j]) {
                    arr[j+1] = arr[j];
                    arr[j] = num;
                }else{
                    arr[j+1] = num;
                    break;
                }
            }
        }

        for(int i : arr) System.out.print(i + " ");

    }
}
