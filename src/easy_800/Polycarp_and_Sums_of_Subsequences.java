package easy_800;

import java.util.Scanner;

public class Polycarp_and_Sums_of_Subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[7];
            for(int i=0;i<7;i++)a[i]=sc.nextInt();
            int first=a[0];
            int sum=a[6]-first;
            int second=0,third=0;
            outer:
            for(int i=1;i<6;i++){
                second=a[i];
                for(int j=i+1;j<6;j++){
                    if(second+a[j]==sum){
                        third=a[j];
                        break outer;
                    }
                }
            }
            System.out.println(first+" "+second+" "+third);
        }
    }
}
