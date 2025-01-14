package easy_800;

import java.util.Scanner;

public class Two_Screens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            int c=0;
            for (int i=0;i<Math.min(a.length(),b.length());i++){
                if(a.charAt(i)!=b.charAt(i))break;
                c++;
            }
            if(c>0)c--;
            int ans=a.length()+b.length()-c;
            System.out.println(ans);
        }
    }
}
