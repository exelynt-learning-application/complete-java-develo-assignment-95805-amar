public class TypeCastingDemo {

    public static void main(String[] args) {

        // Declare variables
        double doubleValue = 45.89;
        float floatValue = 23.75f;
        int intValue = 100;

        // Convert double to int
        int doubleToInt = (int) doubleValue;

        // Convert float to int
        int floatToInt = (int) floatValue;

        // Display original and converted values
        System.out.println("Original double value : " + doubleValue);
        System.out.println("Converted int value   : " + doubleToInt);

        System.out.println("Original float value  : " + floatValue);
        System.out.println("Converted int value   : " + floatToInt);

        System.out.println("Original int value    : " + intValue);

        // Explain data loss
        System.out.println("\nData Loss:");
        System.out.println("The decimal part is removed during narrowing type casting.");
        System.out.println("45.89 becomes 45");
        System.out.println("23.75 becomes 23");
    }
}
