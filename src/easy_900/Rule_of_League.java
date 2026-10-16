package easy_900;

import java.util.Scanner;

public class Rule_of_League {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt()-1;
            int x=sc.nextInt();
            int y=sc.nextInt();
            if (x!=0 && y!=0 || x==0 && y==0) System.out.println(-1);
            else {
                int max=Math.max(x,y);
                if (n%max !=0 ) System.out.println(-1);
                else {
                    for (int i=0;i<n;i++){
                        System.out.print((i/max*max)+2+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
