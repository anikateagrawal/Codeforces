package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[3];
            for (int i=0;i<3;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            if(a[2]>=a[1]+a[0]){
                System.out.println(a[2]-a[1]-a[0]+1);
            }
            else System.out.println(1);
        }
    }
}
