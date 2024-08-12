package easy_800;

import java.util.Scanner;

public class Question_Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int a=0,b=0,c=0,d=0;
            for(char ch:s.toCharArray()){
                switch (ch){
                    case 'A':a++;break;
                    case 'B':b++;break;
                    case 'C':c++;break;
                    case 'D':d++;break;
                }
            }
            int ans=Math.min(a,n)+Math.min(b,n)+Math.min(c,n)+Math.min(d,n);
            System.out.println(ans);
        }
    }
}
