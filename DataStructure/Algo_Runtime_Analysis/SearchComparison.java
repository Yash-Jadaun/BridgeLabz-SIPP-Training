package DataStructure.Algo_Runtime_Analysis;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    
    public static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

   
    public static boolean binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);

            int[] data = new int[size];

          
            for (int i = 0; i < size; i++) {
                data[i] = random.nextInt(size * 10);
            }

           
            int target = data[random.nextInt(size)];

           
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();
            double linearTime = (endLinear - startLinear) / 1_000_000.0;

          
            long startSort = System.nanoTime();
            Arrays.sort(data);
            long endSort = System.nanoTime();
            double sortTime = (endSort - startSort) / 1_000_000.0;

          
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();
            double binaryTime = (endBinary - startBinary) / 1_000_000.0;

            double totalBinaryTime = sortTime + binaryTime;

         
            System.out.printf("Linear Search Time: %.4f ms\n", linearTime);
            System.out.printf("Sorting Time: %.4f ms\n", sortTime);
            System.out.printf("Binary Search Time: %.4f ms\n", binaryTime);
            System.out.printf("Total Time (Sort + Binary Search): %.4f ms\n", totalBinaryTime);
            System.out.println("--------------------------------------------");
        }
    }
}
