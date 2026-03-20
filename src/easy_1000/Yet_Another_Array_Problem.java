package easy_1000;

import java.util.Scanner;

public class Yet_Another_Array_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for (int i=0;i<n;i++)a[i]=sc.nextLong();
            int p[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
            for (int prime:p){
                boolean flag=false;
                for (long i:a){
                    if (i%prime!=0){
                        flag=true;
                        break;
                    }
                }
                if (flag){
                    System.out.println(prime);
                    break;
                }
            }
        }
    }
}
