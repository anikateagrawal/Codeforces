package easy_1200;

import java.util.Scanner;

public class Next_Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean a[]=new boolean[3002];
        for (int i=0;i<n;i++)a[sc.nextInt()]=true;
        for (int i=1;i<=n+1;i++){
            if (!a[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
