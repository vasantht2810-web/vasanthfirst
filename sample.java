import java.util.ArrayList;
import java.util.Arrays;

public class LengthExamples {
    public static void main(String[] args) {
        // 1. Array length (uses .length property)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array length: " + numbers.length); // Output: 5

        // 2. String length (uses .length() method)
        String greeting = "Hello, Java!";
        System.out.println("String length: " + greeting.length()); // Output: 12 (includes spaces & punctuation)

        // 3. ArrayList size (uses .size() method)
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));
        System.out.println("ArrayList size: " + fruits.size()); // Output: 3
    }
}
