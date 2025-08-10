package easy_800;

import java.util.Scanner;

public class Submission_is_All_You_Need {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==0)s++;
                s+=a;
            }

            System.out.println(s);
        }
    }
}
