package easy_800;

import java.util.Scanner;

public class Beautiful_Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(a[i],max);
            }
            System.out.println(max);
        }
    }
}
