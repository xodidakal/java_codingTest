package section02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        int[] input = new int[t];

        for (int i = 0; i < t; i++){
            input[i] = in.nextInt();
        }

        int min = input[0];
        int count = 1;

        for(int student : input)
        {
            if(student > min) {
                min = student;
                count++;
            }
        }

        System.out.println(count);
    }
}
