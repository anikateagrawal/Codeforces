package easy_800;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            int s=0;
            while(max<=n){
                s++;
                int tmp=max;
                max+=min;
                min=tmp;
            }
            System.out.println(s);
        }
    }
}
