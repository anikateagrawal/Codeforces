package easy_800;

import java.util.Scanner;

public class We_Need_the_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=0;
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                x^=a[i];
            }
            if(n%2==0){
                if(x!=0) System.out.println(-1);
                else System.out.println(0);
            }
            else System.out.println(x);
        }
    }
}
