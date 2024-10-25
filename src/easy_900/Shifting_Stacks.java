package easy_900;

import java.util.Arrays;
import java.util.Scanner;


public class Shifting_Stacks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            boolean flag=true;
            for (int i=0;i<n;i++){
                if(a[i]<i){
                    flag=false;
                    break;
                }
                if(i<n-1){
                    a[i+1]+=a[i]-i;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
