package easy_1000;

import java.util.Scanner;

public class Double_ended_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String s2=sc.next();
            int max=0;
            for (int i=0;i<s.length();i++){
                for (int j=i+1;j<=s.length();j++){
                    String sub=s.substring(i,j);
                    if(s2.contains(sub)){
                        max=Math.max(max,sub.length());
                    }
                }
            }
            System.out.println(s.length()+s2.length()-2*max);
        }
    }
}
