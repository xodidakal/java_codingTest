package section06;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 선택정렬 : 순차적으로 본인 뒤에 있는 값중 최소값의 위치와 자신과 변경
        // 13 5 11 7 23 15
        // 1번째 : 5 13 11 7 23 15
        // 2번째 : 5 7 11 13 23 15
        // 3번째 : 5 7 11 13 23 15
        // 4번째 : 5 7 11 13 23 15
        // 3번째 : 5 7 11 13 15 23
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = in.nextInt();

        for(int i = 0; i < n-1; i++) {
            int least = i;
            for(int j= i+1; j < n; j++) {
                if(arr[least] > arr[j]) least = j;
            }

            if(least != i) {
                int temp = arr[i];
                arr[i] = arr[least];
                arr[least] = temp;
            }
        }

        for(int i : arr) System.out.print(i + " ");
    }
}
