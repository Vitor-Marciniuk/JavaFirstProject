import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>();
        int arrayLength = sc.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            numbers.add(sc.nextInt());
        }

        int maxValue = 0;
        for (int i = 0; i < numbers.size()-1; i++) {
            if(numbers.get(i) * numbers.get(i+1) > maxValue) {
                maxValue = numbers.get(i) * numbers.get(i + 1);
            }
        }
        System.out.println(maxValue);
    }
}