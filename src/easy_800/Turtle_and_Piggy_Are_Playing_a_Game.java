package easy_800;

import java.util.Scanner;

public class Turtle_and_Piggy_Are_Playing_a_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), r = sc.nextInt();
            System.out.println((int) (Math.log(r) / Math.log(2)));
        }
    }
}
