package easy_800;

import java.util.Scanner;

public class Recovering_a_Small_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String ans="";
            int r=3;
            if(n>52){
                ans=(char)(n-52-1+'a')+"z"+"z";
            }
            else if(n>27){
                ans="a"+(char)(n-28+'a')+"z";
            }
            else{
                ans="aa"+(char)(n-3+'a');
            }
            System.out.println(ans);
        }
    }
}
