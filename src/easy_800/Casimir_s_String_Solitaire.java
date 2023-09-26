package easy_800;

import java.util.Scanner;

public class Casimir_s_String_Solitaire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int a=0,b=0,c=0;
            for(char ch:s.toCharArray()){
                if(ch=='A')a++;
                else if(ch=='B')b++;
                else c++;
            }
            if(a+c==b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
