package easy_1200;

import java.util.Scanner;

public class Odd_Selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int o=0,e=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0)e++;
                else o++;
            }
            if(o==0) System.out.println("NO");
            else{
                o--;
                x--;
                int p=x/2;
                int r=x%2;
                int op=o/2;
                p-=Math.min(p,op);
                p=p*2+r;
                if(p<=e)
                    System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
}
