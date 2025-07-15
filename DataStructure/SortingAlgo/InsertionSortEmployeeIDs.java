package DataStructure.SortingAlgo;

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        int[] employeeIDs = {103, 101, 105, 102, 104};

        for (int i = 1; i < employeeIDs.length; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }
            employeeIDs[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}
