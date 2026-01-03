package easy_800;

import java.util.Scanner;

public class Two_Brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int a=0,b=0;
            int ans=0;
            for (char ch:s.toCharArray()){
                if(ch=='(')a++;
                else if (ch=='[')b++;
                else if(ch==')'){
                    if(a>0){
                        ans++;
                        a--;
                    }
                }
                else {
                    if(b>0){
                        b--;
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
