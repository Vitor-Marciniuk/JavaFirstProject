package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        class Food{
            String name;
            Double value;
            Integer quantity;

            public void makeItCombo(){
                System.out.println(name + ": $" + value);
            }
            public void earnedAmount(){
                System.out.println(name + ": $" + value*quantity);
            }

            public Double totalValue(){
                return value * quantity;
            }
        }

        Food bubblegum = new Food();
        bubblegum.name = "Bubblegum";
        bubblegum.value = 2.0;
        bubblegum.quantity = 101;
        Food toffee = new Food();
        toffee.name = "Toffee";
        toffee.value = 0.2;
        toffee.quantity = 590;
        Food iceCream = new Food();
        iceCream.name = "Ice Cream";
        iceCream.value = 5.0;
        iceCream.quantity = 450;
        Food milkChocolate = new Food();
        milkChocolate.name = "Milk chocolate";
        milkChocolate.value = 4.0;
        milkChocolate.quantity = 420;
        Food doughnut = new Food();
        doughnut.name = "Doughnut";
        doughnut.value = 2.5;
        doughnut.quantity = 430;
        Food pancake = new Food();
        pancake.name = "Pancake";
        pancake.value = 3.2;
        pancake.quantity = 25;

        System.out.println("Prices:");
        bubblegum.makeItCombo();
        toffee.makeItCombo();
        iceCream.makeItCombo();
        milkChocolate.makeItCombo();
        doughnut.makeItCombo();
        pancake.makeItCombo();

        System.out.println("Earned amount:");
        bubblegum.earnedAmount();
        toffee.earnedAmount();
        iceCream.earnedAmount();
        milkChocolate.earnedAmount();
        doughnut.earnedAmount();
        pancake.earnedAmount();

        double income = 0.0;
        income += bubblegum.totalValue();
        income += toffee.totalValue();
        income += iceCream.totalValue();
        income += milkChocolate.totalValue();
        income += doughnut.totalValue();
        income += pancake.totalValue();

        System.out.println("Income: $" + income);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        double staffExpenses;
        double otherExpenses;
        System.out.println("Staff Expenses:");
        String staffExpenseInput = reader.readLine();
        staffExpenses = Double.parseDouble(staffExpenseInput);
        System.out.println("Other Expenses:");
        String OtherExpenseInput = reader.readLine();
        otherExpenses = Double.parseDouble(OtherExpenseInput);
        System.out.println("Net Income: $" + (income - (staffExpenses + otherExpenses)));
    }
}