package DataStructure.LinearandBinarySearch.StringBuffer;
import java.util.*;

public class ConcatStrings {
    public static String concatenate(String[] words) {
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"Java", "is", "fun"};
        System.out.println(concatenate(arr)); // Output: Javaisfun
    }
}
