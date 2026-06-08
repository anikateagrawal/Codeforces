package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Diverse_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char a[]=s.toCharArray();
            Arrays.sort(a);
            boolean fl=true;
            for (int i=1;i<a.length;i++){
                if (a[i]!=a[i-1]+1)fl=false;
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
