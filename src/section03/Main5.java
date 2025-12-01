package section03;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n-1];

        for(int i=0; i < n-1; i++) arr[i] = i+1;

        int sum = 0;
        int cnt = 0;
        int lt = 0;

        for(int rt=0; rt<n-1; rt++) {
            sum += arr[rt];
            if(sum == n) cnt++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
