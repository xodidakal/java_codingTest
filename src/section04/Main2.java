package section04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : first.toCharArray()) {
            map1.merge(c, 1 , Integer::sum);
        }

        for(char c : second.toCharArray()) {
            map2.merge(c, 1 , Integer::sum);
        }

        if(map1.equals(map2)) System.out.println("YES");
        else System.out.println("NO");

    }
}
