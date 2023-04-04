package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        int p=sc.nextInt();
        for (int i = 0; i < p; i++) {
            s.add(sc.nextInt());
        }
        p=sc.nextInt();
        for (int i = 0; i <p ; i++) {
            s.add(sc.nextInt());
        }
        if(s.size()==n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
