class Ques1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[10] = 50; // Accessing an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
        }
    }
}