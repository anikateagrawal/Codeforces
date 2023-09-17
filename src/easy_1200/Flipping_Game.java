package easy_1200;

import java.util.Scanner;

public class Flipping_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int o=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0)a[i]=-1;
            else o++;
        }
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            sum+=-a[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        if(max==0) System.out.println(o-1);
        else
        System.out.println(o+max);
    }
}
