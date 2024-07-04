package easy_1000;

import java.util.Scanner;

public class Maximum_Cost_Deletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            int c=1;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)!=s.charAt(i+1))c++;
            }
            c=c/2+1;
            System.out.println(Math.max(a*n+b*c,n*(a+b)));
        }
    }
}
