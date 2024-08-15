package easy_800;

import java.util.Scanner;

public class Seating_in_a_Bus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean seat[]=new boolean[n+2];
            boolean rule=true;
            seat[sc.nextInt()]=true;
            for (int i=1;i<n;i++){
                int s=sc.nextInt();
                if(seat[s-1]==false&&seat[s+1]==false){
                    rule=false;
                }
                else seat[s]=true;
            }
            if(rule) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
