package easy_800;

import java.util.Scanner;

public class Arranging_Cats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int a1=0,a2=0;
            for(int i=0;i<n;i++){
                if(a.charAt(i)==b.charAt(i))continue;
                a1+=a.charAt(i)-'0';
                a2+=b.charAt(i)-'0';
            }
            System.out.println(Math.max(a1,a2));
        }
    }
}
