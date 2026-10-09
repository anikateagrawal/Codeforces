package easy_800;

import java.util.Scanner;

public class Divide_and_Conquer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int s=0;
            int min=Integer.MAX_VALUE;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s+=a[i];
                if (a[i]%2==1){
                    int c=0;
                    while (a[i]%2!=0){
                        c++;
                        a[i]/=2;
                    }
                    min=Math.min(min,c);
                }
                else {
                    int c=0;
                    while (a[i]%2!=1){
                        c++;
                        a[i]/=2;
                    }
                    min=Math.min(min,c);
                }
            }
            if (s%2==0) System.out.println(0);
            else System.out.println(min);
        }
    }
}
