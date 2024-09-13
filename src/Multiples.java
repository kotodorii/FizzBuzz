public class Multiples {
    public static void main(String[] args) {
        multipleCount(10);
    }
    public static void multipleCount(int i){
        int count = 0;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }}
