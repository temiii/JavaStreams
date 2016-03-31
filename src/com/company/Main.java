package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            BufferedReader bfr = new BufferedReader(
                    new FileReader(
                            "lines.txt"
                    )
            );
            String line;
            int sumASC;
            while ((line = bfr.readLine()) != null) {
                sumASC = 0;
                for (int i = 0; i < line.length(); i++) {
                    sumASC += line.charAt(i);
                }
                System.out.println(sumASC);
            }
            bfr.close();
        } catch(IOException eo) {
            System.out.println("Not found file!");
        }
    }
}
