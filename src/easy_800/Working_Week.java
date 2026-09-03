package easy_800;

import java.util.Scanner;

public class Working_Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p1=2;
            int p3=n;
            int l1=1;
            int r= n-3;
            int l2=r/3;
            System.out.println(l2-l1);
        }
    }
}
