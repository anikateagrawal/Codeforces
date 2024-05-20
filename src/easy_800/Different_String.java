package easy_800;

import java.util.Scanner;

public class Different_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char a[]=s.toCharArray();
            int p=-1;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch!=s.charAt(0))p=i;
            }
            if(p==-1) System.out.println("NO");
            else{
                System.out.println("YES");
                System.out.println(s.charAt(p)+s.substring(0,p)+s.substring(p+1));
            }
        }
    }
}
