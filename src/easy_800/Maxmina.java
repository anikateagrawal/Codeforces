package easy_800;

import java.util.Scanner;

public class Maxmina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            boolean o=false;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]==1)o=true;
            }
            System.out.println(o?"YES":"NO");
        }
    }
}
