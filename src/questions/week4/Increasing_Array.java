package questions.week4;

import java.util.Scanner;

public class Increasing_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        System.out.println(minOperations(a));
    }
    public static long minOperations(int[] nums) {
        long ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                ans+=nums[i-1]-nums[i];
                nums[i]=nums[i-1];
            }
        }
        return ans;
    }

}
