import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    /**
     * Create the Rectangle class here
     * Add a constructor and a method "calculateArea"
     * Don't forget to mark the instance variables as private!
     */

    static class Rectangle{
        private Double width;
        private Double height;

        public Rectangle(Double width, Double height) {
            this.width = width;
            this.height = height;
        }

        public Double calculateArea(){
            return this.width * this.height;
        }
    }

    public static void main(String[] args) {
        //  Create a Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        //  Read the width and the height of the rectangle from console
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        /**
         * Create an object of your Rectangle class, using width and height read from the console
         * then call your "calculateArea" method and print the result
         */

        Rectangle r = new Rectangle(width, height);
        Double value = r.calculateArea();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(3, RoundingMode.HALF_UP);

        System.out.println(bd.doubleValue());
    }
}