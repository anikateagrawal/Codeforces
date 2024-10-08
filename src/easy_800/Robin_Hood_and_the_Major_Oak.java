package easy_800;

import java.util.Scanner;

public class Robin_Hood_and_the_Major_Oak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=n-sc.nextInt();
            long l=n*(n+1L)/2 - k*(k+1L)/2;
            if(l%2==0)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
