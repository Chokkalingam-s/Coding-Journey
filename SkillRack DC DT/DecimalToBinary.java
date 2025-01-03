class DecimalToBinary
{
        static long decimalToBinary(int N) {
        long B_Number = 0; // Store binary result
        long placeValue = 1; // Place value for binary digits (like 1, 10, 100, etc.)
        
        while (N > 0) {
            int remainder = N % 2; // Get binary digit
            B_Number += remainder * placeValue; // Place the binary digit correctly
            N /= 2; // Divide the number by 2
            placeValue *= 10; // Shift to the next position (units, tens, hundreds)
        }

        return B_Number; 
    }

    public static void main(String[] args) {
        int decimalNumber = 10;
        long binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary equivalent of " + decimalNumber + " is " + binaryNumber);
    }
}
