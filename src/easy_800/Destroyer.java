package easy_800;

import java.util.Scanner;

public class Destroyer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[101];
            for (int i=0;i<n;i++)a[sc.nextInt()]++;
            boolean flag=true;
            for (int i=0;i<100;i++){
                if(a[i]<a[i+1]){
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
