package task1;

import java.util.List;

public class Costs {

    private List<Double> costs;
    private Sorter sorter;

    public Costs(List<Double> costs, Sorter sorter) {
        this.costs = costs;
        this.sorter = sorter;
    }

    public List<Double> getCosts() {
        return costs;
    }

    public void setCosts(List<Double> costs) {
        this.costs = costs;
    }

    public Sorter getSorter() {
        return sorter;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sortCosts() {
        sorter.sort(costs);
    }
}
