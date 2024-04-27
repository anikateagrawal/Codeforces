package easy_900;

import java.util.Scanner;

public class Rudolf_and_the_Ugly_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for(int i=0;i<n-2;i++){
                if(s.charAt(i)=='m'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='p'){
                    c++;
                    i+=2;
                }
                else if(s.charAt(i)=='p'&&s.charAt(i+1)=='i'&&s.charAt(i+2)=='e'){
                    c++;
                    i+=2;
                }
            }
            System.out.println(c);
        }
    }
}
