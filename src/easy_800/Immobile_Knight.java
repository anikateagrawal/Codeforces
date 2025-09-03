package easy_800;

import java.util.Scanner;

public class Immobile_Knight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n>1)n--;
            if(m>1)m--;
            System.out.println(n+" "+m);
        }
    }
}
