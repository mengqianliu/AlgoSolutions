public class Library {

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a;
            a = b;
            b = tmp % a;
        }
        return a;
    }

    public int log2(int a) {
        int result = 0;
        while (a >= 2) {
            result++;
            a >>= 1;
        }
        return result;
    }

}
