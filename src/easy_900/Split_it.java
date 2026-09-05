package easy_900;

import java.util.Scanner;

public class Split_it {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            if (n%2==0 && k==n/2){
                System.out.println("NO");
                continue;
            }
            int i=0,j=n-1;
            while (i<j && s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            if (i>=k) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
