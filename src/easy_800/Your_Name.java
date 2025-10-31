package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Your_Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while (q-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String t=sc.next();
            char a1[]=s.toCharArray();
            char a2[]=t.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if(Arrays.equals(a1,a2)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
