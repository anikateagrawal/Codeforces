package medium_1500;

import java.util.Scanner;

public class Woodcutters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int h[]=new int[n];
        for (int i=0;i<n;i++){
            x[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        int c=Math.min(n,2);
        boolean fellright=false;
        for (int i=1;i<n-1;i++){
            int px=x[i-1];
            if(fellright)px=x[i-1]+h[i-1];
            if(px<x[i]-h[i]){
                c++;
                fellright=false;
            }
            else if(x[i+1]>x[i]+h[i]){
                c++;
                fellright=true;
            }
            else fellright=false;
        }
        System.out.println(c);
    }
}
