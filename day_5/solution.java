
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class solution {
    static ArrayList<ArrayList<Integer>> Rules = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> Records = new ArrayList<>();

    public static void main(String args[]) throws IOException {

        Path path = Paths.get("input.txt");
        List<String> Lines = Files.readAllLines(path);
        for (String line : Lines) {
            // System.out.println(line);
            String[] list = line.split("[|]");
            ArrayList<Integer> rule = new ArrayList<>();
            for (String item : list) {
                try {
                    int X = Integer.parseInt(item);
                    rule.add(X);
                } catch (NumberFormatException e) {
                    if (item.isEmpty())
                        continue;
                    ArrayList<Integer> record = new ArrayList<>();
                    String[] listrecord = item.split("[,]");

                    for (String record_item : listrecord) {
                        record.add(Integer.parseInt(record_item));
                    }
                    Records.add(record);
                }
            }
            if (!rule.isEmpty()) {
                Rules.add(rule);
            }

        }

        visualize2DArrayList(Rules);
        visualize2DArrayList(Records);

    }

    static void visualize2DArrayList(ArrayList<ArrayList<Integer>> list) {
        for (ArrayList<Integer> row : list) {
            System.out.println(row); // Print each row
        }
    }
}