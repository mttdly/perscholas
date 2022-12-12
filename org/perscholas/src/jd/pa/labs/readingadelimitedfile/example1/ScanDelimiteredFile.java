package org.perscholas.src.jd.pa.labs.readingadelimitedfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ScanDelimiteredFile {
    public static void main(String[] args) {
        try {
            File f = new File("./org/perscholas/src/jd/pa/lab/readingadelimitedfile/datasets/cars.csv");
            Scanner scanner = new Scanner(f);                       // Only creates scanner if file exists

            ArrayList<String[]> data = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                data.add(values);
            }
            for (String[] line : data) {
                System.out.println("Car Name: " + line[0] );
                System.out.println("MPG: " + line[1] );
                System.out.println("Cylinder: " + line[2] );
                System.out.println("Displacement: " + line[3]);
                System.out.println("Horsepower: " + line[4]);
                System.out.println("Weight: " + line[5]);
                System.out.println("Acceleration: " + line[6]);
                System.out.println("Model: " + line[7]);
                System.out.println("Origin: " + line[8]);
                System.out.println("===============================");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("That file does not exist");
            e.printStackTrace();
        }
    }
}
