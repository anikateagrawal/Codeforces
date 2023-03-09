package contests;

import java.util.Scanner;

public class Settlement_of_Guinea_Pigs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=0;
            int sm=0;
            int sf=0;
            int un=0;
            int dp=0;
            int f=0;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if(a==1){
                    un++;
//                    System.out.println(sp);

                }
                else{

                    f+=un;
                    un=0;
                }
                if(f>0){
                    sm=f/2;

                    c=Math.max(c,un+1+sm);
                }
                else c=Math.max(c,un);
            }
            System.out.println(c);
        }
    }
}
