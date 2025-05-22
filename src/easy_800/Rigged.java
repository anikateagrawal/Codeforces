package easy_800;

import java.util.Scanner;

public class Rigged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
            }
            int w=a[0][0];
            boolean hasGreaterEndurance=false;
            for (int i=1;i<n;i++){
                if(a[i][0]>=w && a[i][1]>=a[0][1])hasGreaterEndurance=true;
            }
            if(hasGreaterEndurance) System.out.println(-1);
            else System.out.println(w);
        }
    }
}
