package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Shift_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String s2=s;
            char a1[]=s.toCharArray();
            char a2[]=s2.toCharArray();
            Arrays.sort(a2);
            int ans=0;
            for (int i=0;i<n;i++){
                if(a1[i]!=a2[i])ans++;
            }
            System.out.println(ans/2);
        }
    }
}
