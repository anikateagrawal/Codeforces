package easy_800;

import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for (int i = 0; i < n; i++) {
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(q-p>=2)c++;
        }
        System.out.println(c);
    }
}
