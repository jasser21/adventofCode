import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class solution {
    public static List<String> lines;
    public static Integer wordCount;

    public static void main(String args[]) {
        Path filePath = Paths.get("./input.txt");
        wordCount = 0;
        try {
            lines = Files.readAllLines(filePath);
            int n = lines.size();
            for (int i = 0; i < n; i++) {
                String line = lines.get(i);
                int n1 = line.length();
                for (int j = 0; j < n1; j++) {
                    if (line.charAt(j) == 'A') {
                        Integer[] X_position = new Integer[2];
                        X_position[0] = i;
                        X_position[1] = j;
                        WordSearchContext context = new WordSearchContext();
                        context.SearchWord(X_position);
                    }
                }
            }
            System.out.println(wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
