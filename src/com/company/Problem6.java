package com.company;

import java.io.*;

public class Problem6 {

    public static void main(String[] args) {
        Course java = new Course("Java",5);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("course.save")
                    )
            );

            oos.writeObject(java);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("course.save")
                    )
            );

//            Object o = ois.readObject();
//            System.out.println(o);
            ois.close();
        }catch(Exception eo) {
            System.out.println("Not found file!");
        }

    }
}
//    ObjectInputStream, ObjectOutputStream
//    Create a class Course that has a String field containing the name and an
// integer field containing the number of students attending the course. Set the name of the new file as course.save.

