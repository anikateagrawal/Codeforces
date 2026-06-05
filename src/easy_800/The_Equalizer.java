package easy_800;

import java.util.Scanner;

public class The_Equalizer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int sum=0;
            for (int i=0;i<n;i++){
                sum+=sc.nextInt();
            }
            if (sum%2==1) System.out.println("YES");
            else if ((n*k)%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
