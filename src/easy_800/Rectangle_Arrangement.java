package easy_800;

import java.util.Scanner;

public class Rectangle_Arrangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            int maxx=0,maxy=0;
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
                maxx=Math.max(maxx,a[i][0]);
                maxy=Math.max(maxy,a[i][1]);
            }
            System.out.println(2*(maxx+maxy));

        }
    }
}
