package tcs_codevita;

import java.math.BigDecimal;
import java.util.Scanner;

public class Password_Generator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            try {
                String num = sc.next();
                if (num.indexOf(".") == -1) num += ".0";
                if (num.indexOf("e") == -1&&num.indexOf("E")==-1)
                    num += "e200";
                String name = sc.next();
                BigDecimal n;
                try {
                    n = new BigDecimal(num);
                } catch (Exception e) {
                    System.out.println("invalid");
                    continue;
                }
                if (!validName(name)) {
                    System.out.println("invalid");
                    continue;
                }
                num = n.toString();
                String n2[] = num.split("E");
                String sign = "+";
                if (n2[1].charAt(0) == '-') sign = "-";
                int exp = Integer.parseInt(n2[1].substring(1)) - 200;
//            System.out.println(exp);
                if (exp < 0) {
                    sign = "-";
                    exp *= -1;
                }
                if (exp == 0) sign = "";
                String s1 = convert(n2[0].charAt(0) - '0') + "." + convert(sumDig(n2[0].substring(2))) + "e" + sign + convert(sumDig("" + exp)) + "@";
                String s2 = "";
                for (int i = 1 - exp % 2; i < name.length(); i += 2) s2 += name.charAt(i);
                System.out.println(s1 + s2);
            }
            catch (Exception e){
                System.out.println("Invalid");
            }
        }
    }
    static String convert(int d){
        switch (d){
            case 0:return "zer";
            case 1:return "one";
            case 2:return "two";
            case 3:return "thr";
            case 4:return "fou";
            case 5:return "fiv";
            case 6:return "six";
            case 7:return "sev";
            case 8:return "eig";
            case 9:return "nin";
        }
        return "";
    }
    static int sumDig(String s){
        int sum=0;
        for(char ch:s.toCharArray()){
            sum+=ch-'0';
        }
        if(sum<=9)return sum;
        return sumDig(""+sum);
    }
    static boolean validName(String s){
        for(char ch:s.toCharArray()){
            if(!Character.isLetter(ch)||!Character.isLowerCase(ch))return false;
        }
        return true;
    }
}
