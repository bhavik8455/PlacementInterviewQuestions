import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the length of the array
        int length = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input

        int k; // Variable to store the kth unique element to find
        int count = 1; // Variable to count occurrences of each element
        String[] arr = new String[length]; // Array to store the input strings

        // Read the input strings
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        // Read the value of k
        k = sc.nextInt();

        List<String> unique = new ArrayList<>(); // List to store unique elements

        // Check each element for uniqueness
        for (int i = 0; i < arr.length; i++) {
            count = 1; // Reset count for each element
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i].equals(arr[j])) {
                        count++; // Increment count if duplicate is found
                    }
                }
            }
            if (count == 1) {
                unique.add(arr[i]); // Add to unique list if element is unique
            }
        }

        // Check if there are fewer unique elements than k
        if (unique.size() < k) {
            System.out.println(""); // Print empty string if not enough unique elements
        } else {
            System.out.println(unique.get(k - 1)); // Print the kth unique element
        }
    }
}
