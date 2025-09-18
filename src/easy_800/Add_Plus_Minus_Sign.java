package easy_800;

import java.util.Scanner;

public class Add_Plus_Minus_Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            String s = sc.next();
            int ones = (s.charAt(0) == '1') ? 1 : 0;
            String out = "";
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (++ones % 2 == 0)
                        out += "-";
                    else
                        out += "+";
                } else
                    out += "+";
            }
            System.out.println(out);
        }
    }
}
