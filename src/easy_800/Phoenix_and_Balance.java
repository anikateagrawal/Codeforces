package easy_800;

import java.util.Scanner;

public class Phoenix_and_Balance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s1=0,s2=0;
            s2+=Math.pow(2,n);
            for(int i=1;i<=n-1;i++){
                if(i<n/2)s2+=Math.pow(2,i);
                else s1+=Math.pow(2,i);
            }
            System.out.println(Math.abs(s1-s2));
        }
    }
}
