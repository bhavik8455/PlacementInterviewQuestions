import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the length of the array
        int Arrlen = sc.nextInt();
        int[][] Arr = new int[Arrlen][Arrlen]; // 2D array to store the matrix
        int[] horizontal = new int[Arrlen]; // Array to store max values of each row
        int[] vertical = new int[Arrlen]; // Array to store max values of each column
        int hortemp = 0; // Temporary variable to store max value in a row
        int vertemp = 0; // Temporary variable to store max value in a column
        int count = 0; // Variable to count the total increment needed

        // Fill the matrix and find the max value in each row
        for (int i = 0; i < Arrlen; i++) {
            for (int j = 0; j < Arrlen; j++) {
                Arr[i][j] = sc.nextInt();
                if (hortemp < Arr[i][j]) {
                    hortemp = Arr[i][j];
                }
            }
            horizontal[i] = hortemp; // Store the max value of the row in the horizontal array
            hortemp = 0; // Reset hortemp for the next row
        }

        // Find the max value in each column
        for (int i = 0; i < Arrlen; i++) {
            for (int j = 0; j < Arrlen; j++) {
                if (vertemp < Arr[j][i]) {
                    vertemp = Arr[j][i];
                }
            }
            vertical[i] = vertemp; // Store the max value of the column in the vertical array
            vertemp = 0; // Reset vertemp for the next column
        }

        // Calculate the total increment needed to make each element the min of max of its row and column
        for (int i = 0; i < Arrlen; i++) {
            for (int j = 0; j < Arrlen; j++) {
                if (Arr[i][j] < horizontal[i] && Arr[i][j] < vertical[j]) {
                    int num = Math.min(horizontal[i], vertical[j]); // Find the minimum of the max values
                    count += num - Arr[i][j]; // Increment the count by the difference
                    Arr[i][j] = num; // Update the matrix element
                }
            }
        }

        // Output the total increment needed
        System.out.println(count);
    }
}
