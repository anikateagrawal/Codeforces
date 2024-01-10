package easy_800;

import java.util.Scanner;

public class Can_I_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long s=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s+=a[i];
            }
            if((int)(Math.sqrt(s))==Math.sqrt(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
