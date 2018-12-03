package main.java.days;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oliviachisman on 12/1/18
 */
public class Day1 extends Day {

    public Day1(File file) {
        super(file);
    }

    public void solvePart1() throws IOException {
        BufferedReader reader = getReader(file);

        Integer frequency = 0;

        String line = "";
        while ((line = reader.readLine()) != null) {
            Integer newFreq = Integer.valueOf(line);

            frequency += newFreq;
        }

        print("Final frequency: " + frequency);
    }

    public void solvePart2() throws IOException {
        BufferedReader reader = getReader(file);
        String line;

        List<Integer> initFreqs = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            initFreqs.add(Integer.valueOf(line));
        }

        List<Integer> seenFreqs = new ArrayList<>();
        int index = 0;
        Integer frequency = 0;

        while (!seenFreqs.contains(frequency)) {
            seenFreqs.add(frequency);
            if (index >= initFreqs.size()) {
                index = 0;
            }
            frequency += initFreqs.get(index);
            index++;
        }

        print("First repeated frequency: " + frequency);
    }
}
