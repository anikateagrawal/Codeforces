package easy_800;

import java.util.Scanner;

public class Prove_Him_Wrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if (Math.pow(3,n-1)>1e9) System.out.println("NO");
            else {
                System.out.println("YES");
                int s=1;
                for (int i=0;i<n;i++){
                    System.out.print(s+" ");
                    s=s*3;
                }
                System.out.println();
            }
        }
    }
}
