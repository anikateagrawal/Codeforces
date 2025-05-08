package easy_800;

import java.util.Scanner;

public class Dr_TC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int o=0;
            for(char ch:s.toCharArray())if(ch=='1')o++;
            long ans=0;
            for (char ch:s.toCharArray()){
                if(ch=='1')ans+=o-1;
                else ans+=o+1;
            }
            System.out.println(ans);
        }
    }
}
