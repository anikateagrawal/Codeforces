package easy_1100;

import java.util.Scanner;

public class Transfusion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long se=0,so=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i%2==0)se+=a[i];
                else so+=a[i];
            }
            int ne=(n+1)/2;
            int no=n/2;
            if(se%ne!=0||so%no!=0) System.out.println("NO");
            else {
                if (se/ne!=so/no) System.out.println("NO");
                else System.out.println("YES");
            }

        }
    }
}
