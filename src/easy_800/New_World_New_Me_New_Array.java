package easy_800;

import java.util.Scanner;

public class New_World_New_Me_New_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=Math.abs(sc.nextInt());
            int p=sc.nextInt();
            int r=(k+(p-1))/p;
            System.out.println(r>n?-1:r);
        }
    }
}
