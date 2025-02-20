class NoOf1Bits
{   
//Brian Kernighan’s Algorithm
    public static int HammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n-1);
            //n & (n-1) removes that 1 while keeping all other bits unchanged.
            count++;
        }
        return count;
    }

    public static int HammingWeight1(int n) {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int n=11;
        System.out.println("Number of 1 bits in binary representation of "+n+" is: "+ HammingWeight(n));
    }
}