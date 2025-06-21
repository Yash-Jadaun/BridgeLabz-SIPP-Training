package EXTRAS_java_string_handling;

public class vowelconsoCounte {

    public static void main(String[] args) {
        String str1 = "Hello World";
        countVowelsAndConsonants(str1);

        String str2 = "Programming is Fun!";
        countVowelsAndConsonants(str2);

        String str3 = "Java";
        countVowelsAndConsonants(str3);

        String str4 = "123 testing";
        countVowelsAndConsonants(str4);

        String str5 = "";
        countVowelsAndConsonants(str5);
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

      
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

        
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
          
        }

        System.out.println("String: \"" + str + "\"");
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
       
    }
}