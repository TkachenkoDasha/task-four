package task1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> list = Arrays.asList(3.6, 7.8, 1.0);
        BubbleSort bubbleSort = new BubbleSort();
        Costs costs = new Costs(list, bubbleSort);
        costs.sortCosts();
        for (Double cost : costs.getCosts()) {
            System.out.print(cost + " ");
        }

        System.out.println();

        costs.setSorter(new InsertionSort());
        costs.sortCosts();
        for (Double cost : costs.getCosts()) {
            System.out.print(cost + " ");
        }

        System.out.println();

        costs.setSorter(new SelectionSort());
        costs.sortCosts();
        for (Double cost : costs.getCosts()) {
            System.out.print(cost + " ");
        }
    }
}
