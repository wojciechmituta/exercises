public class OrderedTable {
    public int[] table;

    public OrderedTable(int[] table) {
        this.table = table;
    }

    public int[] tableAscendingOrganizer() {
        int check;
        for (int k = 0; k < table.length - 1; k++) {
            for (int i = 0; i < table.length - 1; i++) {
                if (table[i] > table[i + 1]) {
                    check = table[i + 1];
                    table[i + 1] = table[i];
                    table[i] = check;
                }
            }
        }
        return table;
    }

    public int[] tableDescendingOrganizer() {
        int check;
        for (int k = 0; k < table.length - 1; k++) {
            for (int i = 0; i < table.length - 1; i++) {
                if (table[i] < table[i + 1]) {
                    check = table[i + 1];
                    table[i + 1] = table[i];
                    table[i] = check;
                }
            }
        }
        return table;
    }

    public int[] tableOrganizer(boolean asd) {
        if (asd) {
            return tableDescendingOrganizer();
        }

        return tableAscendingOrganizer();
    }

    public void tablePrinter() {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }

    public static void main(String[] args) {
        int[] table1 = {2, 3, 5, 6, 1};

        OrderedTable orderedTable = new OrderedTable(table1);
        orderedTable.tableOrganizer(false);
        orderedTable.tablePrinter();
    }
}