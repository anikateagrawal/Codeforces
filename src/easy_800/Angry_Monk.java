package easy_800;

import java.util.Scanner;

public class Angry_Monk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();int k=sc.nextInt();
            int max=0;
            long sum=0;
            for (int i=0;i<k;i++){
                int a=sc.nextInt();
                sum+=a+a-1;
                max=Math.max(max,a);
            }
            sum-=(max+max-1);
            System.out.println(sum);
        }

    }
}
