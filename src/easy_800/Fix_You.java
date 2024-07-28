package easy_800;

import java.util.Scanner;

public class Fix_You {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c=0;
            for (int i=0;i<n;i++){
                String s=sc.next();
                for (int j=0;j<m;j++){
                    if(i==n-1&&j==m-1)continue;
                    else if(i==n-1&&s.charAt(j)=='D')c++;
                    else if(j==m-1&&s.charAt(j)=='R')c++;
                }
            }
            System.out.println(c);
        }
    }
}
