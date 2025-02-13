package easy_800;

import java.util.Scanner;

public class Skibidus_and_Ohio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            boolean flag=false;
            for (int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    flag=true;
                }
            }
            if(flag) System.out.println(1);
            else System.out.println(s.length());
        }
    }
}
