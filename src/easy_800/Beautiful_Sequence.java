package easy_800;

import java.util.Scanner;

public class Beautiful_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean fl=false;
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if (a[i]<=i+1)fl=true;
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
