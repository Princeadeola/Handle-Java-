package Week2.Lab;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Chocolate Chip";

        // returns 'h'
        char a = str.charAt(1);
        System.out.println("The charAt(1) is : " + a);

        // returns negative because our input string "Oreo" is less than str
        int b = str.compareTo("Oreo");
        System.out.println("str compared to b is : " + b);

        // returns 0 because it Ignores the case sensitivity
        int c = str.compareToIgnoreCase("chocolate chip");
        System.out.println("str compareToIgnoreCase to c is : " + c);

        // Returns Chocolate Chip Cookie
        String d = str.concat(" Cookie");
        System.out.println("After concatenation : " + d);

        // returns false because Chocolate Chip does not contain 'z'
        boolean e = str.contains("z");
        System.out.println("Does str contain z : " + e);

        // The index of 'a' in Chocolate Chip is 6
        int f = str.indexOf("a");
        System.out.println("The index of a : " + f);

        // The index of h from index 5 is 11
        int g = str.indexOf("h", 5);
        System.out.println("The position of 'h' from index 5 : " + g);

        // Returns the strings starting from index 10
        String h = str.substring(10);
        System.out.println("Substring : " + h);

    }
}
