package easy_800;

import java.util.Scanner;

public class Halloumi_Boxes
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(k>1) System.out.println("YES");
            else {
                boolean f=true;
                for (int i=0;i<n-1;i++){
                    if(a[i+1]<a[i])f=false;
                }
                if(f) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
