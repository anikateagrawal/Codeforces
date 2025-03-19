package easy_800;

import java.util.Scanner;

public class Contest_Proposal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            int i=0,j=0;
            int c=0;
            while (j<n){
                if(a[i]>b[j]){
                    c++;
                    i--;
                }
                i++;j++;
            }
            System.out.println(c);
        }
    }
}
