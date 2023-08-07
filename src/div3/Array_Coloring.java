package div3;

import java.util.Scanner;

public class Array_Coloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int e=0,o=0;
            for(int i=0;i<n;i++){
                if(a[i]%2==0)e++;
                else o++;
            }
            if(o%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
