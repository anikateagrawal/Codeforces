package easy_1100;

import java.util.Scanner;

public class Array_Fix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean sorted=true;
            int p=0;
            outer:
            for (int i=0;i<n;i++){
                if(a[i]>=10){
                    if(canSplit(a[i]) && a[i]/10>=p){
                        p=a[i]%10;
                    }
                    else {
                        for (int j=i;j<n;j++){
                            if(a[j]<p){
                                sorted=false;
                            }
                            else p=a[j];
                        }
                        break outer;
                    }
                }
                else {
                    if(a[i]>=p)p=a[i];
                    else {
                        sorted=false;
                        break outer;
                    }
                }
            }
            if(sorted) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean canSplit(int n){
        return  n%10>=n/10;
    }
}
