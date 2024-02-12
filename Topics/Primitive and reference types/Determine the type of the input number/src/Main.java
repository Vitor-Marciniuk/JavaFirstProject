import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        char[] c = value.toCharArray();
        // Place your code here
        try{
            Integer.valueOf(value);
            if(c[0] == '-')
                System.out.println("negative");
            else if(c[0] == '0')
                System.out.println("zero");
            else
                System.out.println("positive");
        }catch (Exception e){
            System.out.println("non-integer");
        }
        sc.close();
    }
}