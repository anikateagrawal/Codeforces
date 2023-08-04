package easy_800;

import java.util.Scanner;

public class Fair_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int n1=0,n2=0;
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if(a==1)n1++;
                else n2++;
            }
            if(n2%2==1){
                if(n1<2) System.out.println("NO");
                else {
                    n1-=2;
                    if(n1%2==0) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
            else {
                if(n1%2==0) System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
}
