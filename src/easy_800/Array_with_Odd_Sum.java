package easy_800;

import java.util.Scanner;

public class Array_with_Odd_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int o=0,e=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a%2==0)e++;
                else o++;
            }
            if(o==0) System.out.println("NO");
            else if(o%2==1) System.out.println("YES");
            else if(e>0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
