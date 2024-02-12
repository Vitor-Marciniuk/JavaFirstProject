import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Integer number = null;
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            number = sc.nextInt();
            numbersArray.add(number);
        }

        int counter = 0;
        for (int i = 0; i < numbersArray.size(); i++) {
                if (i + 3 > numbersArray.size()) {
                    break;
                }
                if (numbersArray.get(i) == numbersArray.get(i + 1) - 1
                        && numbersArray.get(i) == numbersArray.get(i + 2) - 2) {
                    counter++;
                }
        }
        System.out.println(counter);
    }
}