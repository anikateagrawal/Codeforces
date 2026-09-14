package easy_800;

import java.util.Scanner;

public class Marin_and_Photoshoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            for (int i=1;i<n;i++){
                char ch=s.charAt(i);
                if (ch=='0'){
                    if (s.charAt(i-1)=='0')ans+=2;
                    else if (i>1 && s.charAt(i-2)=='0')ans+=1;
                }
            }
            System.out.println(ans);
        }
    }
}
