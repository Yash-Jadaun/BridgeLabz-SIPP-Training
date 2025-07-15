package DataStructure.LinearandBinarySearch.BinarySearchProblem;

public class FirstLastOccurrence {
    public static int[] findFirstLast(int[] arr, int target) {
        return new int[]{firstOccurrence(arr, target), lastOccurrence(arr, target)};
    }

    private static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }

    private static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int[] result = findFirstLast(arr, 2);
        System.out.println(result[0] + " " + result[1]); // Output: 1 3
    }
}
