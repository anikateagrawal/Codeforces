package easy_800;

import java.util.Scanner;

public class Short_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int c=0;
            String v="abc";
            for (int i = 0; i < 3; i++) {
                if(s.charAt(i)!=v.charAt(i))c++;
            }
            if(c==0||c==2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
