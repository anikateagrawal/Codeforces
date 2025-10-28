package easy_900;

import java.util.Scanner;

public class Wet_Shark_and_Odd_and_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        long oddsum=0;
        int oddCount=0;
        long minOdd=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int v=sc.nextInt();
            if(v%2==0)sum+=v;
            else{
                oddCount++;
                oddsum+=v;
                minOdd=Math.min(minOdd,v);
            }
        }
        if(oddCount%2==1){
            oddsum-=minOdd;
        }
        System.out.println(sum+oddsum);
    }
}
