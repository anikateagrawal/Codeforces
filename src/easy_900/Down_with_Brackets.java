package easy_900;

import java.util.Scanner;

public class Down_with_Brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int bal=0;
            int z=0;
            for (char ch:s.toCharArray()){
                if(ch=='(')bal++;
                else bal--;
                if(bal==0)z++;
            }
            if(z>1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
