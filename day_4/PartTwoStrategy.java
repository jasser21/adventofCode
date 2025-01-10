public class PartTwoStrategy implements SearchStrategy {

    public boolean check(Character ch, Character[] chars) {
        if (chars == null || ch == null) {
            return false; // Handle null cases gracefully
        }
        for (Character character : chars) {
            if (ch.equals(character)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void Search(Integer[] X_position) {
        // TODO Auto-generated method stub
        try {

            Character[] chars = new Character[2];
            chars[0] = 'S';
            chars[1] = 'M';
            String line = solution.lines.get(X_position[0]);
            int n = line.length();
            int s = solution.lines.size();
            if (X_position[0] > 0 && X_position[0] < s &&
                    X_position[1] > 0 && X_position[1] < n &&
                    (check(solution.lines.get(X_position[0] - 1).charAt(X_position[1] - 1), chars) &&
                            check(solution.lines.get(X_position[0] + 1).charAt(X_position[1] + 1), chars) &&
                            solution.lines.get(X_position[0] - 1).charAt(X_position[1] - 1) != solution.lines
                                    .get(X_position[0] + 1).charAt(X_position[1] + 1))
                    &&
                    (check(solution.lines.get(X_position[0] + 1).charAt(X_position[1] - 1), chars) &&
                            check(solution.lines.get(X_position[0] - 1).charAt(X_position[1] + 1), chars) &&
                            solution.lines.get(X_position[0] + 1).charAt(X_position[1] - 1) != solution.lines
                                    .get(X_position[0] - 1).charAt(X_position[1] + 1)))
                solution.wordCount++;

        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("String index out of bound at position" + X_position[0] + "," + X_position[1]);
        }
    }

}
