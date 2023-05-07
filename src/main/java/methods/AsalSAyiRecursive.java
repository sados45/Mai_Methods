package methods;
import java.util.Scanner;
public class AsalSAyiRecursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " sayısı ASALDIR !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }

    public static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 2) {
            return (sayi == 2) ? true : false;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        if (bolen * bolen > sayi) {
            return true;
        }
        return isAsal(sayi, bolen + 1);
    }
}


