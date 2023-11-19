package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Replacing_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            boolean f=true;
            for(int i=0;i<n;i++){
                if(a[i]>d)f=false;
            }
            if(f){
                System.out.println("YES");
                continue;
            }
            if(a[0]+a[1]<=d) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
