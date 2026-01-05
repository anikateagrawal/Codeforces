package easy_800;

import java.util.Scanner;

public class Traveling_Salesman_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p[][]=new int[n][2];
            int minx=Integer.MAX_VALUE,maxx=Integer.MIN_VALUE;
            int miny=Integer.MAX_VALUE,maxy=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                p[i][0]=sc.nextInt();
                p[i][1]=sc.nextInt();
                minx=Math.min(minx,p[i][0]);
                maxx=Math.max(maxx,p[i][0]);
                miny=Math.min(miny,p[i][1]);
                maxy=Math.max(maxy,p[i][1]);
            }
            int dx=(maxx-minx)*2,dy=(maxy-miny)*2;
            if(minx>=0)dx+=Math.abs(minx)*2;
            else if (maxx<=0)dx+=Math.abs(maxx)*2;
            if(miny>=0)dy+=Math.abs(miny)*2;
            else if (maxy<=0)dy+=Math.abs(maxy)*2;
            System.out.println(dx+dy);
        }
    }
}
