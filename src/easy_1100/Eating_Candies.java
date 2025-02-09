package easy_1100;

import java.util.Scanner;

public class Eating_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int i=0,j=n-1;
            int al=0,b=0;
            int max=0;
            while (i<=j){
                if(al<b){
                    al+=a[i++];
                }
                else if(b<al){
                    b+=a[j--];
                }
                else{
                    al+=a[i++];
                }
                if(al==b)max=Math.max(max,i+n-j-1);
            }
            System.out.println(max);
        }
    }
}
