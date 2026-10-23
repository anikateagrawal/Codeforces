package easy_800;

import java.util.Scanner;

public class Sorting_with_Twos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean f=true;
            for (int i=2;i<n-1;i++){
                if ((i&(i+1))>0 && a[i]>a[i+1]){
                    f=false;
                    break;
                }
            }
            System.out.println(f?"YES":"NO");
        }
    }
}
