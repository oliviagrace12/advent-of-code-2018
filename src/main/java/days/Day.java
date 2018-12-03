package main.java.days;

import java.io.*;

/**
 * Created by oliviachisman on 12/1/18
 */
public abstract class Day {

    final File file;

    Day(File file) {
        this.file = file;
    }

    public abstract void solvePart1() throws IOException;

    public abstract void solvePart2() throws IOException;

    BufferedReader getReader(File file) throws FileNotFoundException {
        return new BufferedReader(new FileReader(file));
    }

    void print(String string) {
        System.out.println(string);
    }
}
