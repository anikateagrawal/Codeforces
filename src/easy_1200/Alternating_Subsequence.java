package easy_1200;

import java.util.Scanner;

public class Alternating_Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int p=a[0];
            int ps=1;
            if(p<0)ps=-1;
            long sum=p;
            for(int i=1;i<n;i++){
                int cs=1;
                if(a[i]<0)cs=-1;
                if(ps==-1){
                    if(cs==-1&&a[i]>p){
                        sum=sum-p+a[i];
                        p=a[i];
                    }
                    else if(cs==1){
                        ps=1;
                        p=a[i];
                        sum+=a[i];
                    }
                }
                else{
                    if(cs==1&&a[i]>p){
                        sum=sum-p+a[i];
                        p=a[i];
                    }
                    else if(cs==-1){
                        ps=-1;
                        p=a[i];
                        sum+=a[i];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
