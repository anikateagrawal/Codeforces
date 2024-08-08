package easy_800;

import java.util.Scanner;

public class Showering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int m=sc.nextInt();
            int pf=0;
            boolean bath=false;
            for (int i=0;i<n;i++){
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(l-pf>=s){
                    bath=true;
                }
                pf=r;
            }
            if(m-pf>=s){
                bath=true;
            }
            if(bath) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
