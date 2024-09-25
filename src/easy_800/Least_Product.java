package easy_800;

import java.util.Scanner;

public class Least_Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long p=1;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a<0)p*=-1;
                else if(a==0)p=0;
            }
            if(p<=0) System.out.println(0);
            else {
                System.out.println(1);
                System.out.println(1+" " +0);
            }
        }
    }
}
