package easy_800;

import java.util.Scanner;

public class Morning_Sandwich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int b=sc.nextInt()-1;
            int c=sc.nextInt()+sc.nextInt();
            int l=1+Math.min(b,c)*2;
            System.out.println(l);
        }
    }
}
