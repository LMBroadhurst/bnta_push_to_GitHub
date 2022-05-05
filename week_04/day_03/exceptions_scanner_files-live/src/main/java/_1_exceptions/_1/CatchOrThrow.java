package _1_exceptions._1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CatchOrThrow {

    public static void main(String[] args) {

        File file = new File("file.txt");

        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
