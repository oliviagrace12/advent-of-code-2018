package main.java.days;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by oliviachisman on 12/2/18
 */
public class Day2 extends Day {

    List<String> ids = new ArrayList<>();

    public Day2(File file) {
        super(file);
    }

    @Override
    public void solvePart1() throws IOException {
        BufferedReader reader = getReader(file);
        String line;

        while ((line = reader.readLine()) != null) {
            ids.add(line);
        }

        int num2 = 0;
        int num3 = 0;

        for (String id : ids) {
            Map<Character, Integer> numChars = new HashMap<>();
            for (Character c : id.toCharArray()) {
                if (numChars.containsKey(c)) {
                    numChars.put(c, numChars.get(c) + 1);
                } else {
                    numChars.put(c, 1);
                }
            }

            if (numChars.values().contains(2)) {
                num2++;
            }
            if (numChars.values().contains(3)) {
                num3++;
            }
        }

        print("Checksum: " + num2 * num3);
    }

    @Override
    public void solvePart2() {
        String finalId1 = "";
        String finalId2 = "";
        for (String id : ids) {
            for (String id2 : ids) {
                if (id.equals(id2)) {
                    continue;
                }
                int numDiff = 0;
                for (int i = 0; i < id.length(); i++) {
                    if (id.charAt(i) != id2.charAt(i)) {
                        numDiff++;
                    }
                }
                if (numDiff < 2) {
                    finalId1 = id;
                    finalId2 = id2;
                    print("id 1: " + id + ", id 2: " + id2);
                }
            }
        }

        StringBuilder commonChars = new StringBuilder();
        for (int i = 0; i < finalId1.length(); i++) {
            if (finalId1.charAt(i) == finalId2.charAt(i)) {
                commonChars.append(finalId1.charAt(i));
            }
        }

        print("Common characters: " + commonChars.toString());
    }
}
