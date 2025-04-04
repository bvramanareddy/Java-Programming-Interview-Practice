package strings;

public class AccountNumberExtract {
    public static int extractAccountNumberFromString(String input){
        String accNumberstr= input.replaceAll("[^0-9]", "");
        int accNumber = Integer.parseInt(accNumberstr);
        return accNumber;
    }

    public static void main(String[] args) {
        String input = "Ramana52162678";
        System.out.println(extractAccountNumberFromString(input));
    }
}
