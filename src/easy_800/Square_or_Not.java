package easy_800;

import java.util.Scanner;

public class Square_or_Not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            double sqrt=Math.sqrt(n);
            if(sqrt!=(int)sqrt) System.out.println("No");
            else {
                int z=0;
                for (char ch: s.toCharArray())if(ch=='0')z++;
                int ex=(int)((sqrt-2)*(sqrt-2));
                if(z==ex) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}
