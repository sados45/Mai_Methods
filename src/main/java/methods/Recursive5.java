package methods;
import java.util.Scanner;

public class Recursive5 {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("N sayısını giriniz: ");
            int n = input.nextInt();
            recursive5(n, n);
        }

        public static void recursive5(int n, int original) {
            if (n <= 0) { // n negatif veya 0 ise fonksiyondan çık
                System.out.print(n + " ");
                return;
            }

            System.out.print(n + " ");
            recursive5(n-5, original); // n'den 5 çıkararak fonksiyonu tekrar çağır
            if (n != original) { // ilk değer hariç, yani n değeri orijinal n'den farklıysa, n'ye 5 ekleyerek fonksiyonu tekrar çağır
                System.out.print(n + " ");
                recursive5(n+5, original);


                /*
                parametresi var: "n" ve "original". "n" parametresi, her seferinde 5 çıkarılarak güncellenen sayıdır. "original" parametresi, fonksiyona ilk olarak gönderilen kullanıcının girdiği sayıdır. Bu değer fonksiyonun çalışması boyunca sabit kalır.

Fonksiyonun ilk if bloğunda, "n" değeri negatif veya 0 ise fonksiyondan çıkılır ve "n" değeri ekrana yazdırılır. Daha sonra, "n" değeri her seferinde ekrana yazdırılır ve "recursive5" fonksiyonu kendini, "n" değerinden 5 çıkararak tekrar çağırır. Bu işlem, "n" değeri negatif veya 0 olduğunda sona erer.

Son olarak, "if (n != original)" bloğu kontrol edilir. Bu blok, ilk seferde çalışmaz çünkü "n" ve "original" değerleri aynıdır. Ancak, bir sonraki seferde "n" değeri, "original" değerinden farklı olduğu için bu blok çalışır. Bu blokta, "n" değeri ekrana yazdır
                 */
            }
        }
    }


