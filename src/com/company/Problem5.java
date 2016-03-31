package com.company;

/*
Problem 5.	Save an ArrayList of doubles
Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream,
ObjectOutputStream. Set the name of the new file as doubles.list
*/

import java.io.*;
import java.util.*;

import static java.lang.System.*;

public class Problem5 {
    public static void main(String[] args) {

        ArrayList<Double> grades = new ArrayList<Double>();
        grades.add(5.5);
        grades.add(3.2);
        grades.add(4.75);
        try{
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    "doubles.list")));
            oos.writeObject(grades);

            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    "doubles.list")));

        while(true){
            try{
                Object o = ois.readObject();
                System.out.println("Grades: " + o);

            } catch(EOFException ef){
                break;
            }
        }

        ois.close();
        } catch(Exception eo) {
            System.out.println("Not found file!");
        }
    }
}
