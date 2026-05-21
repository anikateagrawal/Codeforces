package easy_1000;

import java.util.Scanner;

public class Two_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            boolean fl=false;
            for (int i=0;i<a.length()-1;i++){
                if (a.charAt(i)==b.charAt(i) && a.charAt(i)=='0' && a.charAt(i+1)==b.charAt(i+1) && a.charAt(i+1)=='1'){
                    fl=true;
                    break;
                }
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
