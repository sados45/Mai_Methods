package methods;

import java.util.Scanner;


public class UsluSayiHesaplama {
        /*
        Bu programda "usHesapla" adlı bir metot tanımlanmıştır. Bu metot, bir taban değeri ve bir üs değeri alır. Eğer üs değeri 0 ise, metot 1 döndürür. Ancak üs değeri 0'dan farklı ise, metot kendini tekrar çağırarak üs değerini 1 azaltır ve sonucu taban ile çarpar. Bu işlem, üs değeri 0 olana kadar devam eder ve sonunda sonuç döndürülür. Bu işlem, recursive yani özyinelemeli bir şekilde yapılır, çünkü metot kendi kendini çağırarak işlemleri gerçekleştirir.







         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");

        int taban = input.nextInt();

        System.out.print("Üs değerini giriniz: ");

        int us = input.nextInt();

        int sonuc = usHesapla(taban, us);

        System.out.println("Sonuç: " + sonuc);
    }

    public static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }
}


