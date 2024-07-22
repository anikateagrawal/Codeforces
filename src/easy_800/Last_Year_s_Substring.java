package easy_800;

import java.util.Scanner;

public class Last_Year_s_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            if(s.startsWith("2020")) System.out.println("YES");
            else if(s.startsWith("202")&&s.endsWith("0")) System.out.println("YES");
            else if(s.startsWith("20")&&s.endsWith("20")) System.out.println("YES");
            else if(s.startsWith("2")&&s.endsWith("020")) System.out.println("YES");
            else if(s.endsWith("2020")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
