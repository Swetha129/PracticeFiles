package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlock {
    public FinallyBlock() {
    }

    public static void main(String[] args) {
        BufferedReader fileinput = null;

        try {
            FileReader fileReader = new FileReader("java_practice.txt");
            fileinput = new BufferedReader(fileReader);
            System.out.println(fileinput.read());
            fileinput.close();
        } catch (IOException e) {
            System.out.println("IO Exception " + e.getMessage());
        } finally {
            System.out.println("Finally Block");
        }

    }
}