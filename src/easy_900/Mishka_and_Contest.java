package easy_900;

import java.util.Scanner;

public class Mishka_and_Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int s=0;
        for (int i=0;i<n;i++){
            if(a[i]>k)break;
            s++;
        }
        for (int i=n-1;i>=0;i--){
            if(a[i]>k)break;
            s++;
        }
        s=Math.min(s,n);
        System.out.println(s);
    }
}
