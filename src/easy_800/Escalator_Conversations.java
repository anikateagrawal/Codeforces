package easy_800;

import java.util.Scanner;

public class Escalator_Conversations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int h=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int c=0;
            for(int i:a){
                int d=Math.abs(h-i);
                if(d==0)continue;
                if(d%k==0&&d/k<m)c++;
            }
            System.out.println(c);
        }
    }
}
