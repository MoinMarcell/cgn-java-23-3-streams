package de.neuefische;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        Files.lines(Path.of("students.csv"))
                .skip(1)
                .map(line -> line.split(","))
                .map(split -> {
                    if (split.length >= 4 && !split[0].isEmpty() && !split[2].isEmpty() && !split[3].isEmpty()) {
                        return new Student(
                                Integer.parseInt(split[0]),
                                split[1],
                                Integer.parseInt(split[2]),
                                Integer.parseInt(split[3])
                        );
                    } else {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .forEach(students::add);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}