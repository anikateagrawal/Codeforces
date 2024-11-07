package easy_800;

import java.util.Scanner;

public class Quintomania {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean flag=true;
            for (int i=0;i<n-1;i++){
                int d=Math.abs(a[i]-a[i+1]);
                if(d!=5&&d!=7){
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
