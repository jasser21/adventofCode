
public class VerticaleSearch implements SearchStrategy {

    @Override
    public void Search(Integer[] X_position) {

        try {
            if (X_position[0] + 3 < solution.lines.size() &&
                    solution.lines.get(X_position[0] + 1).charAt(X_position[1]) == 'M' &&
                    solution.lines.get(X_position[0] + 2).charAt(X_position[1]) == 'A' &&
                    solution.lines.get(X_position[0] + 3).charAt(X_position[1]) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;
            }
            if (X_position[0] - 3 >= 0 &&
                    solution.lines.get(X_position[0] - 1).charAt(X_position[1]) == 'M' &&
                    solution.lines.get(X_position[0] - 2).charAt(X_position[1]) == 'A' &&
                    solution.lines.get(X_position[0] - 3).charAt(X_position[1]) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;

            }
        } catch (IndexOutOfBoundsException e) {
            // Catching and handling the exception
            System.out.println("IOOB verticale line " + X_position[0]);
        }

    }

}