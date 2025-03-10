package easy_800;

import java.util.Scanner;

public class Shape_Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=0,y=0;
            int p[][]=new int[n][2];
            for (int i=0;i<n;i++){
                p[i][0]=sc.nextInt();p[i][1]=sc.nextInt();
                x+=p[i][0];
                y+=p[i][1];
            }
            System.out.println(2*(x-p[0][0]+y-p[0][1]+2*m));
        }
    }
}
