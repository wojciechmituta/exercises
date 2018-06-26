import java.util.ArrayList;
import java.util.List;

public class FiboSum {

    public void nElementsSum(int n) {
        int sum = 0;
        List<Integer> table = new ArrayList<>();
        table.add(1);
        table.add(1);

        for (int i = 0; i < n - 1; i++) {
            table.add(table.get(i) + table.get(i + 1));
        }

        for (int i = 0; i < n; i++) {
            sum += table.get(i);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {

        FiboSum fiboSum = new FiboSum();
        fiboSum.nElementsSum(4);
    }
}
