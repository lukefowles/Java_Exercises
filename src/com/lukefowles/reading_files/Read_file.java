package com.lukefowles.reading_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read_file {

    public static List<Person> readFile() {
        List<Person> people = new ArrayList<>();
        File file = new File("src/people.txt");
        try {
            Scanner scanner = new Scanner(file);
            //ignore first line
            scanner.nextLine();
            while(scanner.hasNext()) {
                String[] personData = scanner.nextLine().split(",");
                Person person = new Person(personData[0], personData[1], personData[2], personData[3], personData[4]);
                people.add(person);
            }
        } catch(FileNotFoundException e) {
             e.printStackTrace();
        }
        return people;
    }
}
