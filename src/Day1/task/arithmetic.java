package Day1.task;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();

        // CALC CODE
        double tip = ((mealCost * tipPercent) / 100);
        double tax = ((mealCost * taxPercent) / 100);
        double numberToRound = tip + tax + mealCost;

        int totalCost = (int) Math.round(numberToRound);

        System.out.printf("The total meal cost is %d dollars", totalCost);
    }
}
