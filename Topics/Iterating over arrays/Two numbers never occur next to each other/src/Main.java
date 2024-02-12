import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        List<Integer> integerList = new ArrayList<Integer>();

        for (int i = 0; i < arraySize; i++) {
            int number = sc.nextInt();
            integerList.add(number);
        }

        int n = sc.nextInt();
        int m = sc.nextInt();

        Boolean nAndMAdjacent = false;
        for (int i = 0; i < integerList.size()-1; i++) {
            if (integerList.contains(n) && integerList.contains(m)) {
                if(integerList.get(i + 1).equals(m) || integerList.get(i + 1).equals(n))
                    nAndMAdjacent = true;
                    break;
            }
        }
        System.out.println(!nAndMAdjacent);
    }
}