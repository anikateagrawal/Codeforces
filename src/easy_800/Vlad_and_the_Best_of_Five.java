package easy_800;

import java.util.Scanner;

public class Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char ch=s.charAt(0);
            int c=1;
            for(int i=1;i<s.length();i++){
                char cc=s.charAt(i);
                if(cc==ch)c++;
                else c--;
                if(c==-1){
                    c=1;
                    ch=cc;
                }
            }
            System.out.println(ch);
        }
    }
}
