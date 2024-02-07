import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
//        System.out.println("Input start number: ");
        int start = scanner.nextInt();
//        System.out.println("Input end number: ");
        int end = scanner.nextInt();
        double sum = 0;
        int length = 0;
        for (int i = start; i <= end; i++) {
            while (i % 3 == 0){
//                System.out.println("sum: " + sum +" length:" + length + " i: " + i );
                sum += i;
                length++;
                i++;
            }
        }
        double result = sum/length;
//        System.out.println("sum: " + sum);
        System.out.println(result);
    }
}