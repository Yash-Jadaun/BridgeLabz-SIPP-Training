package DataStructure.LinearandBinarySearch.StringBuffer;
public class CompareBufferBuilder {
    public static void main(String[] args) {
        long start, end;

        StringBuffer buffer = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) buffer.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start));

        StringBuilder builder = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) builder.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start));
    }
}
