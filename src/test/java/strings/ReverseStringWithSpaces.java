package strings;

public class ReverseStringWithSpaces {

    public static String reverseTheStringWithSpaces(String originalString) {
        String[] words = originalString.split(" ");
        StringBuilder finalRevString = new StringBuilder();
        String eachWord = "";
        for (int i = words.length - 1; i >= 0; i--) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                eachWord += words[i].charAt(j);
            }
            eachWord += " ";
        }
        return finalRevString.append(eachWord).toString();
    }

    public static void main(String[] args) {
        String input = "I Love Java Programming";
        String output = reverseTheStringWithSpaces(input);
        System.out.println("Given Original String is: "+ input);
        System.out.println("Reversed String is: "+ output);
    }
}
