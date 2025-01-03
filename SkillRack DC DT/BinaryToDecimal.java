public class BinaryToDecimal {
    static int binaryToDecimal(int binary) {
        int decimalNumber = 0;
        int base = 1; // 2^0 = 1 (base position starts from 0)

        while (binary > 0) {
            int lastDigit = binary % 10; // Extract last binary digit
            decimalNumber += lastDigit * base; // Add it to the decimal result
            binary /= 10; // Remove the last digit from the binary number
            base *= 2; // Update the base to the next power of 2
        }

        return decimalNumber;
    }

    public static void main(String[] args) {
        int binaryNumber = 1101; // Input binary number
        int decimalNumber = binaryToDecimal(binaryNumber); // Convert to decimal
        System.out.println("Decimal of binary " + binaryNumber + " is: " + decimalNumber);
    }
}
