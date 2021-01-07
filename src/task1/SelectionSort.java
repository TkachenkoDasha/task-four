package task1;

import java.util.List;

public class SelectionSort implements Sorter {

    public void sort(List<Double> listToSort) {

        for (int i = 0; i < listToSort.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < listToSort.size(); j++) {
                if (listToSort.get(j) < listToSort.get(minIdx)) {
                    minIdx = j;
                }
            }

            double temp =  listToSort.get(minIdx);
            listToSort.set(minIdx, listToSort.get(i));
            listToSort.set(i, temp);
        }
    }
}
