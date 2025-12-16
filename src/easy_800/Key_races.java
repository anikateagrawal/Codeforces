package easy_800;

import java.util.Scanner;

public class Key_races {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        long p1=(2*t1)+l*v1;
        long p2=(2*t2)+l*v2;
        if(p1==p2) System.out.println("Friendship");
        else if(p1>p2) System.out.println("Second");
        else System.out.println("First");
    }
}
