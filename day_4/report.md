# Java Problem-Solving Session: Common Challenges and Solutions

## Understanding Java Data Types: Integer vs. int

When working with numbers in Java, developers often face the choice between primitive types and their wrapper classes. The distinction between `int` and `Integer` represents a fundamental concept in Java that affects both performance and functionality.

### Primitive int vs. Integer Wrapper

The primitive `int` type serves as the foundation for integer operations in Java. It operates directly on the value and is stored in the stack memory, making it highly efficient for basic numerical operations. For example:

```java
int age = 25;  // Primitive type
age++;         // Direct value manipulation
```

In contrast, the `Integer` wrapper class provides object-oriented functionality around integer values. It's stored in the heap memory and offers additional capabilities:

```java
Integer population = 1000000;  // Wrapper class
String asText = population.toString();  // Access to object methods
population = null;  // Can represent absence of value
```

### Making the Right Choice

Consider these factors when choosing between `int` and `Integer`:

Performance-critical code should use `int` because:

- It requires less memory (4 bytes vs 16 bytes for Integer)
- Operations are faster due to direct value manipulation
- No autoboxing/unboxing overhead

Use Integer when you need:

- To store numbers in collections (`List<Integer>`, `Set<Integer>`)
- To represent the absence of a value with `null`
- To utilize object methods like `parseInt()` or `toString()`

## Cross-Class Variable Access Patterns

Accessing variables across different classes requires careful consideration of object-oriented principles. Here's a robust approach to sharing data between classes:

```java
public class DataContainer {
    private List<String> lines;
    private int wordCount;

    // Constructor initializes the data
    public DataContainer() {
        this.lines = new ArrayList<>();
        this.wordCount = 0;
    }

    // Getter methods provide controlled access
    public List<String> getLines() {
        return new ArrayList<>(lines);  // Return copy for immutability
    }

    public int getWordCount() {
        return wordCount;
    }

    // Setter methods with validation
    public void setLines(List<String> newLines) {
        if (newLines != null) {
            this.lines = new ArrayList<>(newLines);
        }
    }
}
```

## Robust Exception Handling

Exception handling is crucial for maintaining program stability. Here's a comprehensive approach to handling index-related exceptions:

```java
public class SafeStringOperations {
    public static char getCharacterSafely(String text, int index) {
        try {
            // Validate input before operation
            if (text == null) {
                throw new IllegalArgumentException("Input string cannot be null");
            }
            if (index < 0 || index >= text.length()) {
                throw new IndexOutOfBoundsException("Index " + index + " is invalid for string of length " + text.length());
            }

            return text.charAt(index);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index access error: " + e.getMessage());
            throw e;  // Re-throw if calling code should handle it
        }
    }
}
```

## Efficient Character Searching

When searching for characters in arrays or strings, efficiency and safety are paramount. Here's an improved version of the character checking method:

```java
public class CharacterSearcher {
    public static boolean containsCharacter(Character target, Character[] chars) {
        // Input validation
        if (target == null || chars == null) {
            return false;
        }

        // Convert to Set for O(1) lookup time
        Set<Character> charSet = new HashSet<>(Arrays.asList(chars));
        return charSet.contains(target);
    }

    // Alternative method for small arrays
    public static boolean linearSearch(Character target, Character[] chars) {
        if (target == null || chars == null) {
            return false;
        }

        for (Character c : chars) {
            if (target.equals(c)) {  // Use equals() for proper null handling
                return true;
            }
        }
        return false;
    }
}
```

## Grid Search Implementation

When implementing grid search operations, boundary checking and clean code organization are essential. Here's a robust implementation for searching "MAS" horizontally:

```java
public class GridSearcher {
    private final List<String> grid;

    public GridSearcher(List<String> grid) {
        this.grid = grid;
    }

    public boolean findHorizontalMAS(int row, int col) {
        // Early boundary checking
        if (row < 0 || row >= grid.size()) {
            return false;
        }

        String line = grid.get(row);
        if (col + 3 >= line.length()) {
            return false;
        }

        // Check for "MAS" pattern
        return line.charAt(col) == 'M' &&
               line.charAt(col + 1) == 'A' &&
               line.charAt(col + 2) == 'S';
    }
}
```

## Safe Character Comparison

When comparing characters across different positions in a grid, proper boundary validation is crucial:

```java
public class SafeGridComparison {
    private final List<String> grid;

    public SafeGridComparison(List<String> grid) {
        this.grid = grid;
    }

    public boolean comparePositions(int row1, int col1, int row2, int col2) {
        if (!isValidPosition(row1, col1) || !isValidPosition(row2, col2)) {
            throw new IllegalArgumentException("Invalid grid positions");
        }

        return grid.get(row1).charAt(col1) != grid.get(row2).charAt(col2);
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < grid.size() &&
               col >= 0 && col < grid.get(row).length();
    }
}
```
