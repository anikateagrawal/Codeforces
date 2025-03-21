package easy_800;

import java.util.Scanner;

public class Even_Odd_Increments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            long sum=0;
            int e=0,o=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                sum+=a;
                if(a%2==0)e++;
                else o++;
            }
            while (q-->0){
                int ty=sc.nextInt();
                int a=sc.nextInt();
                if(ty==0){
                    sum+=e*a;
                    if(a%2==1){
                        o+=e;
                        e=0;
                    }
                }
                else {
                    sum+=o*a;
                    if(a%2==1){
                        e+=o;
                        o=0;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
