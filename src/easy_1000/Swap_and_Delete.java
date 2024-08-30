package easy_1000;

import java.util.Scanner;

public class Swap_and_Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int z=0,o=0;
            for (char ch:s.toCharArray()){
                if(ch=='0')z++;
                else o++;
            }
            int c=0;
            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='0'){
                    if(o>0)o--;
                    else {
                        c=s.length()-i;
                        break;
                    }
                }
                else {
                    if(z>0)z--;
                    else {
                        c=s.length()-i;
                        break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
