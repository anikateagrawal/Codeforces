package easy_800;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split("\\s");
        System.out.println(a.length);
    }
}
