package easy_800;

import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean f[]=new boolean[26];
            String s=sc.next();
            int b=0;
            for (char ch:s.toCharArray()){
                b++;
                if(!f[ch-'A']){
                    b++;
                    f[ch-'A']=true;
                }
            }
            System.out.println(b);
        }
    }
}
