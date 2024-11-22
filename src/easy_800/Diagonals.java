package easy_800;

import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k==0) System.out.println(0);
            else if(k<=n) System.out.println(1);
            else {
                k-=n;
                int d=1;
                for (int i=n-1;i>0;i--){
                    if(k>2*i){
                        k-=2*i;
                        d+=2;
                    } else if (k>i) {
                        d+=2;
                        break;
                    }
                    else {
                        d+=1;break;
                    }
                }
                System.out.println(d);
            }
        }
    }
}
