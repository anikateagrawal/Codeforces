package easy_800;

import java.util.Scanner;

public class Was_there_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s="";
            for (int i=0;i<n-2;i++)s+=sc.next();
            if(s.contains("101")) System.out.println("NO");
            else System.out.println("YES");

        }
    }
}
