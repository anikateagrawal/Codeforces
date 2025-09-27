package easy_800;

import java.util.Scanner;

public class Be_Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int z=0,maxn=Integer.MIN_VALUE;
            int c=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==0)z++;
                else if (a[i]<0){
                    maxn=Math.max(maxn,a[i]);
                    c++;
                }
            }
            if(c%2==1){
                z+=-1*maxn+1;
            }
            System.out.println(z);
        }
    }
}
