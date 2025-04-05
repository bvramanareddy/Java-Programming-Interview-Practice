package strings;

public class StringDigitsSum {
    public static String sumOfTheDigitsInGivenString(String input){
        char[] letters = input.toCharArray();
        StringBuilder sb=  new StringBuilder();
        int sum= 0;
        for (char ch: letters){
            if (Character.isDigit(ch)){
                sum += Character.getNumericValue(ch); //This convert char to int
            } else {
                sb.append(ch);
            }
        }
        return sb.insert(input.indexOf(String.valueOf(input.replaceAll("[^0-9]","").charAt(0))),sum).toString();
        /*
        ramana1234reddy
        ramana10reddy
         */
    }

    public static void main(String[] args) {
        String s= "ramana1234reddy";
        System.out.println(sumOfTheDigitsInGivenString(s));
    }
}
