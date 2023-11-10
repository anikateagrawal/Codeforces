package medium_1700;

import java.util.Scanner;

public class Number_of_Ways {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            total+=a[i];
        }
        int rsum[]=new int[n];
        rsum[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)rsum[i]+=rsum[i+1];
        int w=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(3*sum==total){

            }
        }
    }


}
