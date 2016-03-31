package com.company;

import java.io.*;


public class Problem2 {

    public static void main(String[] args) {
        String oldFileName = "lines.txt";
        String tmpFileName = "linesTemp.txt";

        try {
            BufferedReader bfr = new BufferedReader(
                    new FileReader(
                            oldFileName
                    )
            );

            FileWriter fw = new FileWriter(tmpFileName);

            String line;
            while ((line = bfr.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {
                    fw.write(Character.toUpperCase(line.charAt(i)));
                }
                fw.write("\r\n");
            }


            fw.flush();
            bfr.close();
            fw.close();
        } catch(IOException eo) {
            System.out.println("Not found file!");
        }
        // Once everything is complete, delete old file..
        File oldFile = new File(oldFileName);
        oldFile.delete();

        // And rename tmp file's name to old file name
        File newFile = new File(tmpFileName);
        newFile.renameTo(oldFile);

    }
}
