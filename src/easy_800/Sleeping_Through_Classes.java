package easy_800;

import java.util.Scanner;

public class Sleeping_Through_Classes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int z=0;
            int ans=0;
            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='1'){
                    z=-1*k;
                }
                else {
                    z++;
                    if(z>0)ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
