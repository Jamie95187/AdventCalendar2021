import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class DayOne {

    private Queue<Integer> data = new LinkedList<>();

    public void readFile() {
        String txtFile = "/Users/jamie/IdeaProjects/AdventCalendar2021/src/data/dataOne.txt";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    txtFile
            ));
            String line = reader.readLine();
            while (line != null) {
                data.add(Integer.parseInt(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void solver() {
        int prevNumber = data.poll();
        int numberOfIncreases = 0;
        while (!data.isEmpty()) {
            int currNumber = data.poll();
            if (currNumber > prevNumber) {
                numberOfIncreases++;
            }
            prevNumber = currNumber;
        }
        System.out.println("Number of increase " + numberOfIncreases);
    }

    public void printData() {
        System.out.println("DATA SIZE " + data.size());
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.poll());
        }
    }

}
