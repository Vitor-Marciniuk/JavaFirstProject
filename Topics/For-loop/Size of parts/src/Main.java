import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n;
        int shipped = 0;
        int rejected = 0;
        int fixed = 0;
        int qtyParts;
        int parts = 0;
        qtyParts = scanner.nextInt();
        do {
            n = scanner.nextInt();
            if(n == 0)
                shipped++;
            else if(n == -1)
                rejected++;
            else if(n == 1)
                fixed++;
            parts++;
        } while (parts < qtyParts);
        System.out.println(shipped + " " + fixed + " " + rejected);
    }
}