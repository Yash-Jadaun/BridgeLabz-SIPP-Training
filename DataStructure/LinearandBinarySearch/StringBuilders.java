package DataStructure.LinearandBinarySearch;
import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // ✅ Now uses java.lang.StringBuilder

        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }

        System.out.println(sb.toString()); // Output: 01234
    }
}
//