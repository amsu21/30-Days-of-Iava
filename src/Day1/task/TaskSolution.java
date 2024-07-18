package Day1.task;

import java.util.Scanner;;


public class TaskSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        //CREATED A OBJECT IN FOR TAKING AN INPUT
        double meal_cost = in.nextDouble() ;        // TOOK MEALCOST IN DOUBLE DATA TYPE

        int tipPercent = in.nextInt();
        int taxPercent = in.nextInt();
        double tax = (double) taxPercent / 100 * meal_cost;
        double tip = (double) tipPercent / 100 * meal_cost;
        
        int totalCost = (int) (meal_cost + tip + tax);

        System.out.println("Your total bill is :" + totalCost);
    }
}
