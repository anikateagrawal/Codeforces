package easy_800;

import java.util.Scanner;

public class Love_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        boolean flag=false;
        for (int i=0;i<n;i++){
            int b=a[i];
            int c=a[b-1];
            if(a[c-1]==i+1)flag=true;
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
