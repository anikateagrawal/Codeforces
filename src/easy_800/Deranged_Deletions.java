package easy_800;

import java.util.Scanner;

public class Deranged_Deletions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int in=-1;
            for (int i=0;i<n-1;i++){
                if (a[i]>a[i+1]){
                    in=i;
                    break;
                }
            }
            if (in==-1) System.out.println("NO");
            else {
                System.out.println("YES");
                System.out.println(2);
                System.out.println(a[in]+" "+a[in+1]);
            }
        }
    }
}
