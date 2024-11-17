package easy_800;

import java.util.Scanner;

public class Perfectly_Imperfect_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean f=false;
            for (int i=0;i<n;i++){
                double sqrt=Math.sqrt(a[i]);
                if(sqrt!=(int)sqrt){
                    f=true;
                    break;
                }
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
