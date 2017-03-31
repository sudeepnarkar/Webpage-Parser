package Iterable;

import java.io.*;

public class IterableSample {
    public static void main(String[] args) {
        ULibrary uLibrary = new ULibrary();

        try {
            System.out.println("Starting to write to File");
            File file = new File("Output.txt");

            for (String str:uLibrary) {
                writeFile(file,str);
            }
            System.out.println("Finished writing to File successfully");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(File file, String str) {

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fileWriter);
            br.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
