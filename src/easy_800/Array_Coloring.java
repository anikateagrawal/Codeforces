package easy_800;

import java.util.Scanner;

public class Array_Coloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            boolean flag=true;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i>0 && a[i]%2==a[i-1]%2)flag=false;
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
