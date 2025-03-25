package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Submission_Bait {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[51];
            for (int i=0;i<n;i++)a[sc.nextInt()]++;
            boolean flag=false;
            for (int i=n;i>0;i--){
                if (a[i]%2==1){
                    flag=true;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
