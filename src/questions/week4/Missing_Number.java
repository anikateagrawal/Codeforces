package questions.week4;

import java.util.Scanner;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n-1;i++)a[i]=sc.nextInt();
        System.out.println(missingNumber(a));
    }
    public static int missingNumber(int[] nums) {
        boolean a[]=new boolean[nums.length+1];
        for(int i:nums){
            a[i]=true;
        }
        for(int i=0;i<a.length;i++)if(!a[i])return i;
        return -1;
    }
}
