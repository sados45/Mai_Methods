package examples;
import java.util.Arrays;

public class NearestNumbers {


        public static void main(String[] args) {
            int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
            int target = 5;

            // Diziyi sıralama
            Arrays.sort(numbers);

            // Girilen sayıdan küçük en yakın sayıyı ve girilen sayıdan büyük en yakın sayıyı bulma
            int smaller = findSmaller(numbers, target);
            int larger = findLarger(numbers, target);

            // Sonuçları ekrana yazdırma
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + smaller);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + larger);
        }

        public static int findSmaller(int[] numbers, int target) {
            int smaller = Integer.MIN_VALUE;

            for (int num : numbers) {
                if (num < target) {
                    smaller = num;
                } else {
                    break;
                }
            }

            return smaller;
        }

        public static int findLarger(int[] numbers, int target) {
            int larger = Integer.MAX_VALUE;

            for (int i = numbers.length - 1; i >= 0; i--) {
                int num = numbers[i];
                if (num > target) {
                    larger = num;
                } else {
                    break;
                }
            }

            return larger;
        }
    }


