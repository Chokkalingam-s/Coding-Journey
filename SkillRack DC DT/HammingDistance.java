public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;  // Step 1: XOR the two numbers
        int count = 0;
        
        // Step 2: Count set bits (1s) in XOR result
        while (xor != 0) {
            xor = xor & (xor - 1); // Removes rightmost set bit
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        int x = 5, y = 9;
        System.out.println("Hamming Distance: " + hammingDistance(x, y));
    }
}
