package task1;

import java.util.List;

public class InsertionSort implements Sorter {

    public void sort(List<Double> listToSort) {

            for (int i = 1; i < listToSort.size(); ++i) {
                double key = listToSort.get(i);
                int j = i - 1;

                while (j >= 0 && listToSort.get(j) > key) {
                    listToSort.set(j + 1, listToSort.get(j));
                    j = j - 1;
                }
                listToSort.set(j + 1, key);
            }
        }
}
