package easy_1100;

import java.util.Scanner;

public class Yarik_and_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int max=a[0];
            int sum=0,p=-1;
            for (int i=0;i<n;i++){
                if(p==-1||Math.abs(a[i])%2==p){
                    sum=a[i];
                    p=Math.abs(a[i]%2);
                }
                else {
                    sum+=a[i];
                    p=1-p;
                }
                max=Math.max(max,sum);
                if(sum<0){
                    sum=0;p=-1;
                }
            }
            System.out.println(max);
        }
    }
}
