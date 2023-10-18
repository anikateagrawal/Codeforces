package easy_800;

import java.util.Scanner;

public class Stone_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int mi=-1,mxi=-1;
            int a[]=new int[n];
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]>max){
                    max=a[i];
                    mxi=i;
                }
                if(a[i]<min){
                    min=a[i];
                    mi=i;
                }
            }
            int m1=Math.min(mi,mxi)+1;
            int m2=Math.max(mi,mxi)+1;
//            System.out.println(m1+" "+m2);
            int m=Math.min(Math.min(m2,n-m1+1),m1+n-m2+1);
            System.out.println(m);
        }
    }
}
