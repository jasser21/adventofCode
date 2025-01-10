
public class HorizontaleSearch implements SearchStrategy {

    @Override
    public void Search(Integer[] X_position) {
        try {
            String line = solution.lines.get(X_position[0]);
            if (X_position[1] + 3 < line.length() && line.charAt(X_position[1] + 1) == 'M'
                    && line.charAt(X_position[1] + 2) == 'A' && line.charAt(X_position[1] + 3) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;
            }
            if (X_position[1] - 3 >= 0 && line.charAt(X_position[1] - 1) == 'M' && line.charAt(X_position[1] - 2) == 'A'
                    && line.charAt(X_position[1] - 3) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;

            }
        } catch (IndexOutOfBoundsException e) {
            // Catching and handling the exception
            System.out.println("IOOB horizontale line " + X_position[0]);
        }

    }

}
