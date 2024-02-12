import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int initialValue = scanner.nextInt();
        int finalValue = scanner.nextInt();
        do {
            if(initialValue % 3 == 0 && initialValue % 5 == 0)
                System.out.println("FizzBuzz");
            else if(initialValue % 5 == 0)
                System.out.println("Buzz");
            else if(initialValue % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(initialValue);
            initialValue++;
        } while (initialValue <= finalValue);
    }
}