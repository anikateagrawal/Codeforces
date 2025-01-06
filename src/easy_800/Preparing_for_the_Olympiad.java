package easy_800;

import java.util.Scanner;

public class Preparing_for_the_Olympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            int m=0,s=0;
            for (int i=0;i<n;i++){
                if(i<n-1){
                    if(a[i]>b[i+1]){
                        m+=a[i];s+=b[i+1];
                    }
                }
                else m+=a[i];
            }
            System.out.println(m-s);
        }
    }
}
