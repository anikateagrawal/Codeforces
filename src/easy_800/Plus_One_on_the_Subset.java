package easy_800;

import java.util.Scanner;

public class Plus_One_on_the_Subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                max=Math.max(a,max);
                min=Math.min(a,min);
            }
            System.out.println(max-min);
        }
    }
}
