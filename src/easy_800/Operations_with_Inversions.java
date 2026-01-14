package easy_800;

import java.util.Scanner;

public class Operations_with_Inversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int op=0;
            int max=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]<max)op++;
                else max=a[i];
            }
            System.out.println(op);
        }
    }
}
