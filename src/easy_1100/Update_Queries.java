package easy_1100;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Update_Queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            TreeSet<Integer> in=new TreeSet<>();
            for (int i=0;i<m;i++)in.add(sc.nextInt());
            String c=sc.next();
            char ch[]=c.toCharArray();
            Arrays.sort(ch);
            char ans[]=s.toCharArray();
            int idx=0;
            for (int i:in){
                ans[i-1]=ch[idx++];
            }
            System.out.println(new String(ans));
        }
    }
}
