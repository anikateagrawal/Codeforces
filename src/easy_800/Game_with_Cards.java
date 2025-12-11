package easy_800;

import java.util.*;

public class Game_with_Cards {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), max1 = 0, max2 = 0;
            while(n-- > 0) max1 = Math.max(max1, sc.nextInt());
            n = sc.nextInt();
            while(n-- > 0) max2 = Math.max(max2, sc.nextInt());
            System.out.println(max1 >= max2 ? "Alice" : "Bob");
            System.out.println(max2 >= max1 ? "Bob" : "Alice");
        }
    }
}