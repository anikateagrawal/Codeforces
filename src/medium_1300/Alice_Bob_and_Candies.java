package medium_1300;

import java.util.Scanner;

public class Alice_Bob_and_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int as=0,bs=0;
            int i=0,j=n-1;
            int ap=0,bp=0;
            int m=0;
            while (i<=j){
                if(m%2==0){
                    int s=0;
                    while(i<=j&&s<=bp){
                        s+=a[i++];
                    }
                    as+=s;
                    ap=s;
                }
                else{
                    int s=0;
                    while(i<=j&&s<=ap){
                        s+=a[j--];
                    }
                    bs+=s;
                    bp=s;
                }
                m++;
            }
            System.out.println(m+" "+as+" "+bs);
        }
    }
}
