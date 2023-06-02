package easy_900;

import java.util.Scanner;

public class Make_It_Increasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println(fun(a));
        }
    }
    static int fun(int a[]){
        int op=0;
        for(int i=a.length-1;i>0;i--){
            while(a[i-1]>=a[i]&&a[i]>0){
                a[i-1]/=2;
                op++;
            }
            if(a[i-1]>=a[i])return -1;
        }
        return op;
    }
}
