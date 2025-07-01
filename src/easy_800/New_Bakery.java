package easy_800;

import java.util.Scanner;

public class New_Bakery {
    public static void main(String[] args) {
        Scanner us=new Scanner(System.in);
        int testulu = us.nextInt();
        while(testulu-->0) {
            long	u = us.nextInt();
            long 	s = us.nextInt();
            long    y = us.nextInt();
            long 	i = Math.min(u, Math.max(y - s, 0));
            System.out.println(i * y - i * (i - 1) / 2 + (u - i) * s);
        }
    }
}
