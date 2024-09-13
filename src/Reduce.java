public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduceInt(2));
    }
    public static int reduceInt(int n) {
        int count = 0;
        while (n != 0) {
            boolean isEven = n % 2 == 0;
            boolean isOdd = n % 2 != 0;
            if (isEven) {
                n /= 2;
            }
            if (isOdd) {
                n -= 1;
            }
            count ++;
        }
        return count;
    }
}