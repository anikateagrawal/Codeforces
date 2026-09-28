package easy_900;

import java.util.Scanner;

public class Subset_Mex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f[]=new int[101];
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                f[a]++;
            }
            int a=-1,b=-1;
            for (int i=0;i<101;i++){
                if (f[i]>1)continue;
                if (f[i]==1 && a==-1){
                    a=i;
                }
                if (f[i]==0){
                    if (a==-1)a=i;
                    b=i;
                    break;
                }
            }
            System.out.println(a+b);
        }
    }
}
