package easy_1000;

import java.util.Scanner;

public class Make_Equal_Again {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int s=1,e=1;
            for (int i=0;i<n-1;i++){
                if(a[i]==a[i+1])s++;
                else break;
            }
            for (int i=n-1;i>0;i--){
                if(a[i]==a[i-1])e++;
                else break;
            }
            if(e==n)e=0;
            if(n>1&&a[0]==a[n-1]) System.out.println(n-(s+e));
            else System.out.println(n-Math.max(s,e));
        }
    }
}
