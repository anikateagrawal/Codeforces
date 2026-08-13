package easy_800;

import java.util.Scanner;

public class All_Lengths_Subtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int in=-1,max=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]>max){
                    max=a[i];
                    in=i;
                }
            }
            int i=in-1,j=in+1;
            max--;
            while (i>=0 || j<n){
                if (i>=0 && a[i]==max){
                    i--;
                }
                else if (j<n && a[j]==max){
                    j++;
                }
                else break;
                max--;
            }
            if (i<0 && j==n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

