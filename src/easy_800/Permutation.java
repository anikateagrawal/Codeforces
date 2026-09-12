package easy_800;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean a[]=new boolean[n+1];
            int arr[]=new int[n];
            int p=0;
            for (int i=1;i<=n;i++){
                if (a[i])continue;
                int num=i;
                while (num<=n){
                    a[num]=true;
                    arr[p++]=num;
                    num*=2;
                }
            }
            System.out.println(2);
            for (int i:arr) System.out.print(i+" ");
            System.out.println();
        }
    }
}
