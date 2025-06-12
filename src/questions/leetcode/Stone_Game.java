package questions.leetcode;

import java.util.Scanner;

public class Stone_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int piles[]=new int[n];
        for (int i=0;i<n;i++)piles[i]=sc.nextInt();
        System.out.println(stoneGame(piles));
    }
    public static boolean stoneGame(int[] piles) {
        return true;
    }
}
