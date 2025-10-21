package easy_800;

import java.util.Scanner;

public class Difference_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            boolean flag=true;
            for (int i=2;i<n;i++){
                if(a[i]%a[0]!=0)flag=false;
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
