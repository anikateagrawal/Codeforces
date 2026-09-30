package easy_800;

import java.util.Scanner;

public class You_Delete_I_Delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            StringBuilder ans=new StringBuilder("");
            boolean o=false;
            boolean z=false;
            for (char ch:s.toCharArray()){
                if (ch=='0' && z==false){
                    z=true;
                    continue;
                }
                if (ch=='1' && o==false){
                    o=true;continue;
                }
                ans.append(ch);
            }
            System.out.println(ans);
        }
    }
}
