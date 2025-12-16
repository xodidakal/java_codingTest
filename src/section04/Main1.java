package section04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        String vote = in.next();
        Map<Character, Integer> map = new HashMap<>();
        Character answer;

        for(char c : vote.toCharArray()){
            // if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            // else map.put(c, 1);
            map.merge(c,1, Integer::sum);
        }
        answer= map.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);

        System.out.println(answer);

    }
}