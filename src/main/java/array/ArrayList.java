package array;

public class ArrayList {
    public static void main(String[] args) {


        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;

// arr dizisi tanımlanıyor ve boyutları belirleniyor
// arr[0] boyutu 1, arr[1] boyutu 2, arr[2] boyutu 3 olarak ayarlanıyor

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                arr[i][j] = j + 1;
                sum += arr[i][j];
            }
        }

// İki adet for döngüsü kullanılarak arr dizisine değerler atanır.
// İlk for döngüsü satırları temsil eder, i değişkeni 0'dan başlayarak 2'ye kadar artar.
// İkinci for döngüsü sütunları temsil eder, j değişkeni 0'dan başlayarak i+1'e kadar artar.
// Her bir döngü adımında arr[i][j] elemanına j+1 değeri atanır.
// İlk satırda 1, ikinci satırda 2 ve 3, üçüncü satırda ise 4, 5 ve 6 değerleri yer alır.
// Ayrıca sum değişkeni her adımda arr[i][j] elemanının değeri kadar arttırılır.

        System.out.print(sum);

// En son olarak sum değişkeni ekrana yazdırılır.
    }
}