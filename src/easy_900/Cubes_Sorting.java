package easy_900;

import java.util.Scanner;

public class Cubes_Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean flag=true;
            for (int i=0;i<n-1;i++){
                if(a[i]<=a[i+1]){
                    flag=false;
                }
            }
            if(flag) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
