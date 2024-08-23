package easy_800;

import java.util.Scanner;

public class Increasing_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int b=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                b++;
                if(a==b)b++;
            }
            System.out.println(b);
        }
    }
}
