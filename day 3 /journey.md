# **Advent of Code - Day 3 (2024)**

## **Report Summary**

### **Key Concepts Explored:**

#### 1. **String Operations:**

- **Substring Extraction:**
  You learned how to extract substrings from a string using the `substring(int startIndex, int endIndex)` method in Java.
  ```java
  String line = "Hello, World!";
  String extracted = line.substring(0, 5);  // Extracts "Hello"
  ```
- **String Comparison:**
  You practiced comparing substrings using `.equals()` instead of `==` to ensure correct content comparison.
  ```java
  if (line.substring(j, j + 4).equals("mul(")) {
      // Code here
  }
  ```

#### 2. **Incrementing Values:**

- You explored how to perform multiple operations in one line using the post-increment operator (`l++`) and assignment:
  ```java
  int separator = l++;
  ```

#### 3. **Parsing Strings to Integers:**

- You practiced parsing integers from strings using `Integer.parseInt()` and handled possible exceptions (`NumberFormatException`) when the input string is not a valid integer.
  ```java
  int num = Integer.parseInt(str);
  ```

#### 4. **Integer Limits:**

- You explored the maximum and minimum values that an `int` can hold in Java using `Integer.MAX_VALUE` and `Integer.MIN_VALUE`.
- **Maximum `int` value:** `2,147,483,647`
- **Minimum `int` value:** `-2,147,483,648`

---

### **Key Learning Points:**

1. **String Manipulation:**

   - Extracting substrings and comparing strings using `.equals()` are essential skills for string processing. These operations are foundational for solving problems in challenges like Advent of Code.

2. **Integer Parsing and Handling:**

   - Converting strings to integers and handling exceptions with `NumberFormatException` prepares you for robust data parsing. This is especially important when dealing with user input or files.

3. **Incrementing and Assigning Values:**

   - Understanding the use of operators like `++` allows for more concise and readable code, particularly when updating values in loops or complex expressions.

4. **Edge Case Handling:**
   - Properly handling invalid inputs and recognizing integer overflow/underflow are crucial skills in competitive programming. These considerations help prevent errors and crashes in real-world applications.

## Key Improvements:

1. **StartsWith/RegionMatches:** Replaces `substring()` to compare parts of the string more efficiently.
2. **Single Loop for Parsing:** Combines parsing logic to reduce complexity.
3. **Efficient Looping:** Skips over already processed sections of the string to avoid redundant checks.
