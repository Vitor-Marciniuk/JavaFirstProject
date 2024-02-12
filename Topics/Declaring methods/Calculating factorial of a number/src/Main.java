import java.util.*;

public class Main {
    // declare your method here that takes an integer as input and returns the factorial of the number
    private static int factorialMethod(int i){
        int factorial = 1;
        for (int j = i; j >= 1; j--) {
            factorial *= j;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // create objects of Scanner for input
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        // call the method you declared above with the input number to get the factorial
        if( i <= 12 && i >= 1)
            System.out.println(factorialMethod(i));
    }
}