package easy_800;

import java.util.Scanner;

public class Two_distinct_points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while (q-->0){
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            if(l1==l2)
            System.out.println(l1+" "+r2);
            else System.out.println(l1+" "+l2);
        }
    }
}
