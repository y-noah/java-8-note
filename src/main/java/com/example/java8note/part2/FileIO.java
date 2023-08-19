package com.example.java8note.part2;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\WorkSpace\\JavaIO.txt";
        File file = new File(fileName);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("JavaIO");
        fileWriter.write("2023-8-13");
        fileWriter.close();

        FileInputStream fis = new FileInputStream("C:\\WorkSpace\\JavaIO.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fis);
        int ch;
        while((ch = inputStreamReader.read()) != -1) {
            System.out.print((char)ch);
        }
        inputStreamReader.close();

        System.out.println("\n");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) !=null) {
            System.out.println(line);
        }
        bufferedReader.close();

         file.delete();


    }
}
