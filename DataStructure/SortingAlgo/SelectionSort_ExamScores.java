package DataStructure.SortingAlgo;

public class SelectionSort_ExamScores {
    public static void main(String[] args) {
        int[] scores = {88, 75, 90, 68, 80};

        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
