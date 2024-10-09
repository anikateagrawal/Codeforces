package other;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("files/abc.txt");
        Scanner sc=new Scanner(f);
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
