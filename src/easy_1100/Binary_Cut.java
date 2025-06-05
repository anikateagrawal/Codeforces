package easy_1100;

import java.util.Scanner;

public class Binary_Cut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int ans=1;
            int zeroone=0;
            for (int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='1' && s.charAt(i+1)=='0')ans++;
                if(s.charAt(i)=='0' && s.charAt(i+1)=='1')zeroone++;
            }
            if(zeroone>1)ans+=zeroone-1;
            System.out.println(ans);
        }
    }
}
