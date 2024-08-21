package easy_1000;

import java.util.Scanner;

public class Ski_Resort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int q=sc.nextInt();
            long ways=0;
            int d=0;
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                if(temp<=q)d++;
                else d=0;
                if(d>=k){
                    ways+=d-k+1;
                }
            }
            System.out.println(ways);
        }
    }
}
