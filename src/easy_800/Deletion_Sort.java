package easy_800;

import java.util.Scanner;

public class Deletion_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int [n];
            boolean flag=true;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i>0 && a[i]<a[i-1])flag=false;
            }
            if (flag) System.out.println(n);
            else System.out.println(1);
        }
    }
}
