import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value;
        int sum = 0;
        do {
            value = scanner.nextInt();
            sum += value;
        } while (value != 0);

        System.out.println(sum);
    }
}