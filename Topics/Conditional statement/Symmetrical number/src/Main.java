import java.lang.reflect.Array;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String numbers = scanner.next();
        if (isSymmetric(numbers))
            System.out.println("1");
        else
            System.out.println("37");
    }

    private static Boolean isSymmetric(String numbers){
        char[] numberArray = numbers.toCharArray();
        String a = String.valueOf(numberArray[0]);
        String b = String.valueOf(numberArray[1]);
        String c = String.valueOf(numberArray[2]);
        String d = String.valueOf(numberArray[3]);

        if(c.equals(b) && a.equals(d))
            return true;
        else
            return false;
    }
}