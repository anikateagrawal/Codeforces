package easy_800;

import java.util.Scanner;

public class Sakurako_s_Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int ones=sc.nextInt();
            int twos=sc.nextInt();
//            if(ones%2==0 && twos%2==0) System.out.println("YES");
//            else if(ones%2==1) System.out.println("NO");
//            else{
//                if(ones>0) System.out.println("YES");
//                else System.out.println("NO");
//            }

            ones-=(twos%2)*2;
            if(ones%2==1||ones<0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
