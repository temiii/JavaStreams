package com.company;

import java.io.*;

public class Problem4 {


    public static void main(String[] args)  {

        File oldFile = new File("120.jpg");
        File newFile = new File("my-copied-picture.jpg");

        byte[] buffer = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream(oldFile);
            FileOutputStream fos = new FileOutputStream(newFile);

            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

            fos.flush();
            fos.close();
            fis.close();
        } catch(IOException eo) {
            System.out.println("Not found file!");
        }
    }
}
