package easy_1200;

import java.util.Scanner;

public class Sherlock_and_his_girlfriend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+2];
        int k=1;
        for (int i=2;i<n+2;i++){
            if (a[i]!=0)continue;
            a[i]=1;
            for (int j=2;j*i<a.length;j++){
                a[j*i]=2;
                k=2;
            }
        }
        System.out.println(k);
        for (int i=2;i<a.length;i++) System.out.print(a[i]+" ");
    }
}
