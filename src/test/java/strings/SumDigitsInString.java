package strings;

public class SumDigitsInString {
    public static String sumDigitsPresentInString(String input) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        int firstDigitIndex = -1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                if (firstDigitIndex == -1) {
                    firstDigitIndex = result.length();
                }
                sum += Character.getNumericValue(c);
            } else {
                result.append(c);
            }
        }
        if (firstDigitIndex != -1) {
            result.insert(firstDigitIndex, sum);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String name = "Ramana1234Reddy";
        System.out.println(sumDigitsPresentInString(name));
    }
}
