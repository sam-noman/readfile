package com.info.readfile.file.operation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private static final String filePath = "C:\\Users\\13232\\Documents\\JavaUpload\\Firstupoload.txt";

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        boolean isSuccess = false;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String textLines;
            while ((textLines = bufferedReader.readLine()) != null) {
                System.out.println(textLines);
            }
            isSuccess = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isSuccess){
                System.out.println("File read successful.");
            }else {
                System.out.println("File read unsuccessful.");
            }
        }
    }
}
