import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DayTwo {

    private ArrayList<String> instructions = new ArrayList<>();

    public void readFile() {
        String txtFile = "/Users/jamie/IdeaProjects/AdventCalendar2021/src/data/dataTwo.txt";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    txtFile
            ));
            String line = reader.readLine();
            while (line != null) {
                instructions.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void solver() {
        int depth = 0;
        int distance = 0;
        for (String s : instructions) {
            int value = Integer.parseInt(s.split(" ")[1]);
            if(s.contains("forward")) {
                distance += value;
            } else if (s.contains("down")) {
                depth += value;
            } else if (s.contains("up")) {
                depth -= value;
            }
        }
        System.out.println("Horizontal pos * Depth = " + depth * distance);
    }

}
