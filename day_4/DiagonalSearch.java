
public class DiagonalSearch implements SearchStrategy {
    @Override
    public void Search(Integer[] X_position) {
        String line = solution.lines.get(X_position[0]);

        try {
            if (X_position[0] + 3 < solution.lines.size() &&
                    X_position[1] + 3 < line.length() &&
                    solution.lines.get(X_position[0] + 1).charAt(X_position[1] + 1) == 'M' &&
                    solution.lines.get(X_position[0] + 2).charAt(X_position[1] + 2) == 'A' &&
                    solution.lines.get(X_position[0] + 3).charAt(X_position[1] + 3) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;
            }
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("exception");

        }
        try {
            if (X_position[0] + 3 < solution.lines.size() &&
                    X_position[1] - 3 >= 0 &&
                    solution.lines.get(X_position[0] + 1).charAt(X_position[1] - 1) == 'M' &&
                    solution.lines.get(X_position[0] + 2).charAt(X_position[1] - 2) == 'A' &&
                    solution.lines.get(X_position[0] + 3).charAt(X_position[1] - 3) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;
            }
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("exception");
        }
        try {
            if (X_position[0] - 3 >= 0 &&
                    X_position[1] + 3 < line.length() &&
                    solution.lines.get(X_position[0] - 1).charAt(X_position[1] + 1) == 'M' &&
                    solution.lines.get(X_position[0] - 2).charAt(X_position[1] + 2) == 'A' &&
                    solution.lines.get(X_position[0] - 3).charAt(X_position[1] + 3) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;
            }
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("exception");
        }
        try {

            if (X_position[0] - 3 >= 0 &&
                    X_position[1] - 3 >= 0 &&
                    solution.lines.get(X_position[0] - 1).charAt(X_position[1] - 1) == 'M' &&
                    solution.lines.get(X_position[0] - 2).charAt(X_position[1] - 2) == 'A' &&
                    solution.lines.get(X_position[0] - 3).charAt(X_position[1] - 3) == 'S') {
                System.out.println(X_position[0] + "," + X_position[1]);
                solution.wordCount++;
            }

        } catch (IndexOutOfBoundsException e) {
            // Catching and handling the exception
            System.out.println("IOOB Diagonal line " + X_position[0]);

        }

    }
}
