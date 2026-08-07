package easy_800;

import java.util.Scanner;

public class Nikita_and_Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            boolean f=true;
            long p=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]+p <i+1){
                    f=false;
                }
                else {
                    p=a[i]+p-(i+1);
                }
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
