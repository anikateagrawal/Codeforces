package easy_1100;

import java.util.Scanner;

public class Shovels_and_Swords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d=Math.abs(a-b);
            int min=Math.min(a,b);
            int e=Math.min(d,min);
            int r=min-e;
            e+=r/3*2;
            if(r%3==2)e++;
            System.out.println(e);
        }
    }
}
