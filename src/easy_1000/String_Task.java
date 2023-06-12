package easy_1000;

import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String ns="";
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')continue;
            else ns+="."+ch;
        }
        System.out.println(ns);
    }
}
