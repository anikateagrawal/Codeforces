package easy_1000;

import java.util.Scanner;

public class Good_Prefixes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long s=0;
            long c=0;
            int max=0;
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                s+=v;
                max=Math.max(max,v);
                if(s-max==max)c++;
            }
            System.out.println(c);
        }
    }
}
