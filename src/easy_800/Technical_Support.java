package easy_800;

import java.util.Scanner;

public class Technical_Support {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int q=0;
            for (char ch:s.toCharArray()){
                if(ch=='Q')q++;
                else q--;
                if(q<0)q=0;
            }
            if (q==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
