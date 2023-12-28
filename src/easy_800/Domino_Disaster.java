package easy_800;

import java.util.Scanner;

public class Domino_Disaster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String a="";
            for(char ch:s.toCharArray()){
                if(ch=='D')a+="U";
                else if(ch=='U')a+="D";
                else a+=ch;
            }
            System.out.println(a);
        }
    }
}
