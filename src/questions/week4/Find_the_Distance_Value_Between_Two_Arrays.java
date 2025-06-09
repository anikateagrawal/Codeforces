package questions.week4;

import java.util.Scanner;

public class Find_the_Distance_Value_Between_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int n2=sc.nextInt();
        int b[]=new int[n2];
        for (int i=0;i<n2;i++)b[i]=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(findTheDistanceValue(a,b,d));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i:arr1){
            boolean flag = true;
            for(int j:arr2){
                if(Math.abs(i-j)<=d){
                    flag = false;
                }
            }
            if(flag)ans++;
        }
        return ans;
    }
}
