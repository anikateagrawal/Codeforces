package easy_800;

import java.util.Scanner;

public class AI_Project_Development {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            // case 1 without AI
            int s=x+y;
            int t1=(n+(s-1))/s;

            // case 2 with AI
            if (x*z>=n){
                System.out.println(t1);
                continue;
            }
            n-=x*z;
            int t2=z;
            s=x+10*y;
            t2+=(n+(s-1))/s;

            System.out.println(Math.min(t1,t2));
        }
    }
}
