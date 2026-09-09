package easy_800;

import java.util.Scanner;

public class Penchick_and_Modern_Monument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int fr[]=new int[n+1];
            int max=0;
            for (int i=0;i<n;i++){
                fr[sc.nextInt()]++;
            }
            for (int i:fr)max=Math.max(max,i);

            System.out.println(n-max);
        }
    }
}
