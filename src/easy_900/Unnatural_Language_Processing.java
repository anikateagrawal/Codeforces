package easy_900;

import java.util.Scanner;

public class Unnatural_Language_Processing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            StringBuilder ans=new StringBuilder("");
            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='a'||ch=='e')ans.append(ch);
                else{
                    if(i<n-1){
                        char nx=s.charAt(i+1);
                        if(nx=='a'||nx=='e')ans.append("."+ch);
                        else ans.append(ch);
                    }
                    else ans.append(ch);
                }
            }
            if(ans.charAt(0)=='.')ans=ans.replace(0,1,"");
            System.out.println(ans.toString());
        }
    }
}
