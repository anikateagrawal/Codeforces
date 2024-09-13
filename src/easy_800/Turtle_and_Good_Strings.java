package easy_800;

import java.util.Scanner;

public class Turtle_and_Good_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            boolean flag=false;
            for (int i=1;i<n;i++){
                String first=s.substring(0,i);
                String second=s.substring(i);
                if(first.charAt(0)!=second.charAt(second.length()-1)){
                    flag=true;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
