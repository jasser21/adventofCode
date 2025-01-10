import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        // Step 1: Create a Path object representing the file
        Path filePath = Paths.get("/home/mainuser/Desktop/adventofCode/day 3 /input.txt");
        long sum = 0;
        try {
            // Step 2: Call Files.readAllLines() to read the file content
            List<String> lines = Files.readAllLines(filePath);
            boolean enabled = true;
            int len = lines.size();
            for (int i = 0; i < len; i++) {
                String line = lines.get(i);
                int n = line.length();
                for (int j = 0; j + 4 < n; j++) {
                    if ("do()".equals(line.substring(j, j + 4))) {
                        enabled = true;
                    }
                    if (j + 7 < n && "don't()".equals(line.substring(j, j + 7))) {
                        enabled = false;
                    }
                    if (enabled && "mul(".equals(line.substring(j, j + 4))) {
                        int l = 0;
                        while (Character.isDigit(line.charAt(j + 4 + l))) {
                            l++;
                        }
                        if (l > 0 || line.charAt(j + 4 + l) == ',') {
                            int seperator = l++;
                            while (Character.isDigit(line.charAt(j + 4 + l))) {
                                l++;
                            }
                            if (seperator + 1 < l && line.charAt(j + 4 + l) == ')') {
                                // System.out.println(line.substring(j + 4, j + 4 + seperator));
                                // System.out.println(line.substring(j + 5 + seperator, j + 4 + l));
                                sum += Integer.parseInt(line.substring(j + 4, j + 4 + seperator)) * Integer
                                        .parseInt(line.substring(j + 5 + seperator, j + 4 + l));
                            }
                        }
                    }
                }

            }
            System.out.println(sum);
        } catch (IOException e) {
            // Step 3: Handle the IOException
            e.printStackTrace();
        }
    }
}