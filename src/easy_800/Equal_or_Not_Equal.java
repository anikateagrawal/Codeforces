package easy_800;

import java.util.Scanner;

public class Equal_or_Not_Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int n=0;
            for (char ch:s.toCharArray()){
                if(ch=='N')n++;
            }
            if (n==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
