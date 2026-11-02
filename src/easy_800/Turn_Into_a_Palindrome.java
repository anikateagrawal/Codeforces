package easy_800;

import java.util.Scanner;

public class Turn_Into_a_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            char ch=sc.next().charAt(0);
            String s=sc.next();
            int i=0,j=n-1;
            int ans=0;
            while (i<j){
                if (s.charAt(i)!=s.charAt(j)){
                    if (s.charAt(i)==ch || s.charAt(j)==ch)ans++;
                    else ans+=2;
                }
                i++;j--;
            }
            System.out.println(ans);
        }
    }
}
