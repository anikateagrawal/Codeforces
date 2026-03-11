package easy_800;

import java.util.Scanner;

public class Alternating_Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int sum=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i%2==1)sum-=a[i];
                else sum+=a[i];
            }
            System.out.println(sum);
        }
    }
}
