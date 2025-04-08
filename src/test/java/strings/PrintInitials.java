package strings;

public class PrintInitials {
    public static String printInitial(String input){
        StringBuilder initials = new StringBuilder();
        String[] names = input.split(" ");
        for (String name : names){
            initials.append(name.charAt(0));
        }
        return initials.toString();
    }

    public static void main(String[] args) {
        String name1= "Venkata Ramana Reddy";
        System.out.println("Given Name is "+ name1);
        System.out.println("Printing only Intials as "+ printInitial(name1));
    }
}
