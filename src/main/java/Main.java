package main.java;

import main.java.days.Day;
import main.java.days.Day1;
import main.java.days.Day2;

import java.io.File;
import java.io.IOException;

/**
 * Created by oliviachisman on 12/1/18
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/oliviachisman/dev/advent-of-code-2018/src/main/resources/Day2Input.txt");

        Day day = new Day2(file);

        day.solvePart1();
        day.solvePart2();
    }

}
