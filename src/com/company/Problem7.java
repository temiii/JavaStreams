package com.company;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Problem7 {
    public static void main(String[] args) {

        byte[] buffer = new byte[1024];

        try {
            ZipOutputStream zos = new ZipOutputStream(
                    new FileOutputStream(
                            "text-files.zip"
                    )
            );

            ZipEntry ze1 = new ZipEntry("words.txt");

            zos.putNextEntry(ze1);
            FileInputStream in1 = new FileInputStream("words.txt");

            int len1;
            while ((len1 = in1.read(buffer)) > 0) {
                zos.write(buffer, 0, len1);
            }

            in1.close();
            zos.closeEntry();


            ZipEntry ze2 = new ZipEntry("count-chars.txt");

            zos.putNextEntry(ze2);
            FileInputStream in2 = new FileInputStream("count-chars.txt");

            int len2;
            while ((len2 = in2.read(buffer)) > 0) {
                zos.write(buffer, 0, len2);
            }

            in2.close();
            zos.closeEntry();


            ZipEntry ze3 = new ZipEntry("lines.txt");

            zos.putNextEntry(ze3);
            FileInputStream in3 = new FileInputStream("lines.txt");

            int len3;
            while ((len3 = in3.read(buffer)) > 0) {
                zos.write(buffer, 0, len3);
            }

            in3.close();
            zos.closeEntry();

            zos.close();
        } catch(Exception eo) {
            System.out.println("Not found file!");
        }
    }
}
//Create Zip Archive
//Write a program that reads three txt files words.txt, count-chars.txt and lines.txt
//and create a zip archive named text-files.zip. Use FileOutputStream, ZipOutputStream, and FileInputStream.
