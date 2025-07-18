package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Only_One_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            char ch[]=sc.next().toCharArray();
            Arrays.sort(ch);
            System.out.println(ch[0]);
        }
    }
}
