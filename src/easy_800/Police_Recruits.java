package easy_800;

import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int u=0;
        for (int i = 0; i < n; i++) {
            int c=sc.nextInt();
            if(c==-1){
                if(p>0)p--;
                else u++;
            }
            else {
                p+=c;
            }
        }
        System.out.println(u);
    }
}
