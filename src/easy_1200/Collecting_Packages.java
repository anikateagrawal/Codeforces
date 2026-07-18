package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Collecting_Packages {
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
            Arrays.sort(a,(i1,i2)->i1[0]!=i2[0]?i1[0]-i2[0]:i1[1]-i2[1]);
            int x=0,y=0;
            StringBuilder ans=new StringBuilder("");
            boolean fl=true;
            for (int p[]:a){
                if(p[0]>=x && p[1]>=y){
                    while (x<p[0]){
                        ans.append("R");x++;
                    }
                    while (y<p[1]){
                        ans.append("U");y++;
                    }
                }
                else {
                    fl=false;
                    break;
                }
            }
            if (fl) {
                System.out.println("YES");
                System.out.println(ans);
            }
            else System.out.println("NO");
        }
    }
}
