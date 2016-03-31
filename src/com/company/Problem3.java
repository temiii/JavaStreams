package com.company;

import java.io.*;


public class Problem3 {

    public static void main(String[] args) {

        try {

            BufferedReader bfr = new BufferedReader(
                    new FileReader(
                            "words.txt"
                    )
            );

            FileWriter fw = new FileWriter("count-chars.txt");
//, assume that a, e, i, o, u are vowels and all others are consonants. Punctuation marks are (!,.?).
            String line;
            int countV = 0, countP = 0, countC = 0;
            while ((line = bfr.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o'
                            || line.charAt(i) == 'u') {
                        countV++;
                    } else if (line.charAt(i) == '!' || line.charAt(i) == ',' || line.charAt(i) == '.' || line.charAt(i) == '?') {
                        countP++;
                    } else if (line.charAt(i) != ' ') {
                        countC++;
                    }
                }
            }

            fw.write("Vowels: " + countV + "\r\n");
            fw.write("Consonants: " + countC + "\r\n");
            fw.write("Punctuation: " + countP + "\r\n");


            fw.flush();
            bfr.close();
            fw.close();
        }catch(IOException eo) {
            System.out.println("Not found file!");
        }

   }
}
