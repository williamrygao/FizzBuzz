public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 3;
        while (i < 1000) {
            count++;
            i = i + 3;
        }
        int j = 5;
        while (j < 1000) {
            if (j % 3 != 0) {
                count++;
            }
            j = j + 5;
        }
        System.out.println(count);
    }
}
