package easy_800;

import java.util.Scanner;

public class Permutation_Warm_Up {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int sum=0;
            int num=n;
            for (int i=1;i<=n;i++){
                sum+=Math.abs(num-i);
                num--;
            }
            System.out.println(sum/2+1);
        }
    }
}
