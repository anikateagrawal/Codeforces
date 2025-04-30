package easy_1000;

import java.util.Scanner;

public class Cormen_The_Best_Friend_Of_a_Man {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int c=0;
        for (int i=1;i<n;i++){
            int s=a[i]+a[i-1];
            if(s<k){
                c+=k-s;
                a[i]+=k-s;
            }
        }
        System.out.println(c);
        for (int i:a) System.out.print(i+" ");

    }
}
