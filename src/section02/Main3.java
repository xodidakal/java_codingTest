package section02;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] A = new int[t];
        int[] B = new int[t];

        for (int i = 0; i < t; i++){
            A[i] = in.nextInt();
        }

        for (int i = 0; i < t; i++){
            B[i] = in.nextInt();
        }

        // 내가 짠 코드 -> 복잡하고 반복적인 부분이 많음
        // char[] answer = new char[t];
        // for(int i=0; i<t; i++){
        //     switch (A[i]) {
        //         case 1:
        //             if(B[i] == 1) answer[i] = 'D';
        //             else if(B[i] == 2) answer[i] = 'B';
        //             else answer[i] = 'A';
        //             break;
        //         case 2:
        //             if(B[i] == 1) answer[i] = 'A';
        //             else if(B[i] == 2) answer[i] = 'D';
        //             else answer[i] = 'B';
        //             break;
        //         case 3:
        //             if(B[i] == 1) answer[i] = 'B';
        //             else if(B[i] == 2) answer[i] = 'A';
        //             else answer[i] = 'D';
        //             break;
        //         default:
        //             break;
        //     }
        //     System.out.println(answer[i]);
        // }

        for(int i=0; i<t; i++){
            if(A[i] == B[i]) System.out.println("D");
            else if((A[i] == 1 && B[i] == 3)
                || (A[i] == 2 && B[i] == 1)
                || (A[i] == 3 && B[i] == 2))
            {
                System.out.println("A");
            }
            else System.out.println("B");
        }
    }
}
