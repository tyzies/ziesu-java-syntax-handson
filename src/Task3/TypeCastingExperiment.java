package Task3;

public class TypeCastingExperiment {
    public static void main(String[] args) {
        System.out.println("=== EKSPERIMEN TYPE CASTING ===");

        // 1. Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // Automatic conversion
        double doubleValue = longValue; // Automatic conversion

        System.out.println("Implicit Casting:");
        System.out.println("int: " + intValue + " -> long: " + longValue + " -> double: " + doubleValue);

        // 2. Explicit Casting (Narrowing) - Tanpa Data Loss
        double preciseValue = 123.0;
        int convertedInt = (int) preciseValue;

        System.out.println("\nExplicit Casting (no data loss):");
        System.out.println("double: " + preciseValue + " -> int: " + convertedInt);

        // 3. Explicit Casting - Dengan Data Loss
        double decimalValue = 123.789;
        int truncatedInt = (int) decimalValue;

        System.out.println("\nExplicit Casting (with data loss):");
        System.out.println("double: " + decimalValue + " -> int: " + truncatedInt);

        // 4. Overflow Example
        int largeInt = 300;
        byte overflowByte = (byte) largeInt;

        System.out.println("\nOverflow Example:");
        System.out.println("int: " + largeInt + " -> byte: " + overflowByte);

        // 5. Long -> Int (Nilai Besar)
        long bigValue = 9999999;
        int bigIntValue = (int) bigValue;

        System.out.println("\nLong -> Int (dengan nilai besar):");
        System.out.println("long: " + bigValue + " -> int: " + bigIntValue);

        // 6. Float -> Int
        float floatValue = 1234;
        int intfValue = (int) floatValue;

        System.out.println("\nFloat -> Int:");
        System.out.println("float: " + floatValue + " -> int: " + intfValue);

        // 7. Double -> Float
        double doublefValue = 123.123;
        float floatdValue = (float) doublefValue;

        System.out.println("\nDouble -> Float:");
        System.out.println("double: " + doublefValue + " -> float: " + floatdValue);
    }
}

