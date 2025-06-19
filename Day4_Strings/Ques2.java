class Ques2 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // Calling a method on a null object
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught.");
        }
    }
}