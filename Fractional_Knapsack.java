public class Fractional_Knapsack {
    public static void main(String[] args) {
        // Sample weights and values
        double[] weights = {10, 20, 30};
        double[] values = {60, 100, 120};
        double capacity = 50;

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
        for (double w : weights) {
            System.out.print(w + " ");
        }
        
    }
}
