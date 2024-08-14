package easy_800;

import java.util.Scanner;

public class Primary_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String n=sc.next();

            if(!n.startsWith("10")||n.length()<3){
                System.out.println("NO");continue;
            }

            String p=n.substring(2);
            int pow=Integer.parseInt(p);

            if(p.startsWith("0")||pow<2) {
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
