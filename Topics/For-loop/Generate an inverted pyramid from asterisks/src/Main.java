import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows for the pyramid
        int n = scanner.nextInt();
        // For each row..
        // write a loop that starts at 'n' and ends at 1 (hint: you can use a decrement)
        for (int i = n; i > 0; i--) {
            // For each column..
            // write another loop inside the first one that starts at the current row number and ends at 1
            int counter = i;
            while(counter > 0) {
                System.out.print('*');
                counter--;
            }
                // After each row, print a newline character ('\n')
            System.out.print('\n');
        }
    }
}