package task1;

import java.util.List;

public class BubbleSort implements Sorter {

    public void sort(List<Double> listToSort) {

        for (int i = 0; i < listToSort.size() - 1; i++)
            for (int j = 0; j < listToSort.size() - i - 1; j++)
                if (listToSort.get(j) > listToSort.get(j + 1)) {
                    double temp = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j + 1));
                    listToSort.set(j + 1, temp);
                }
    }
}
