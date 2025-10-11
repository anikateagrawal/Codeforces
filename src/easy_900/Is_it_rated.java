package easy_900;

import java.util.Scanner;

public class Is_it_rated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        boolean changed=false;
        boolean sorted=true;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            if(a[i][0]!=a[i][1]){
                changed=true;
            }
            min=Math.min(min,a[i][0]);
            if(a[i][0]!=min){
                sorted=false;
            }
        }
        if(changed) System.out.println("rated");
        else if(sorted) System.out.println("maybe");
        else System.out.println("unrated");
    }
}
