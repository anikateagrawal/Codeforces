package easy_800;

import java.util.Scanner;

public class Aleksa_and_Stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int p=4;
            a[0]=2;a[1]=3;
            for(int i=2;i<n;i++){
                while((3*p)%(a[i-1]+a[i-2])==0)p++;
                a[i]=p++;
            }
            for(int i:a) System.out.print(i+" ");
            System.out.println();
        }
    }
}
