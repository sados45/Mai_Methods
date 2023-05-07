package methods;

import java.util.Scanner;

public class AdvancedCalculator {


   /*
    Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

    Hesap makinesinin fonksiyonları :

    1- Toplama İşlemi
    2- Çıkarma İşlemi
    3- Çarpma İşlemi
    4- Bölme işlemi
    5- Üslü Sayı Hesaplama
    6- Faktoriyel Hesaplama
    7- Mod Alma
    8- Dikdörtgen Alan ve Çevre Hesabı
    */
    // GELİŞMİŞ HESAP MAKİNESİ

    public static int topla(int a, int b){
        return a+b;
    }
    public  static int cikarma(int a, int b){
        return a-b;
    }
    public static int bolme(int a, int b){
        return a/b;
    }
    public static int carpma(int a, int b){
        return a*b;
    }
    public static int uslu(int a, int b) {
        int toplam;
        toplam=a;
        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i < b; i++) {
                toplam *= a;
            }
            return toplam;
        }
    }
    public static  int faktoriyel(int a){
        int toplam;
        toplam=a;
        if(a==0 || a==1){
            return 1;
        }else{
            for(int i=1; i<a; i++){
                toplam *= i;
            }
            return toplam;
        }
    }
    public static int modalma(int a, int b){
        return a % b;
    }
    public static int alancevre(int a, int b){
        int alan, cevre;
        alan = a*b;
        cevre = 2*(a*b);
        System.out.println("Alan: " + alan);
        System.out.print( "Çevre: ");
        return cevre;
    }
    public static void main(String[] args) {
        int a, b, islem;
        Scanner input = new Scanner(System.in);
        System.out.print("1-Toplama, 2-Çıkarma, 3-Çarpma, 4-Bölme, " +
                "5-Üst Alma, 6-Faktöriyel, 7-Mod Al, 8-Alan-Çevre: ");
        islem = input.nextInt();

        switch (islem) {
            case 1 -> {
                System.out.print("1. Sayı: ");
                a = input.nextInt();
                System.out.print("2. Sayı: ");
                b = input.nextInt();
                System.out.println(topla(a, b));
            }
            case 2 -> {
                System.out.print("1. Sayı: ");
                a = input.nextInt();
                System.out.print("2. Sayı: ");
                b = input.nextInt();
                System.out.println(cikarma(a, b));
            }
            case 3 -> {
                System.out.print("1. Sayı: ");
                a = input.nextInt();
                System.out.print("2. Sayı: ");
                b = input.nextInt();
                System.out.println(carpma(a, b));
            }
            case 4 -> {
                System.out.print("1. Sayı: ");
                a = input.nextInt();
                System.out.print("2. Sayı: ");
                b = input.nextInt();
                System.out.println(bolme(a, b));
            }
            case 5 -> {
                System.out.print("Sayı Gir: ");
                a = input.nextInt();
                System.out.print("Üst Kuvvetini Gir: ");
                b = input.nextInt();
                System.out.println(uslu(a, b));
            }
            case 6 -> {
                System.out.print("Sayı Gir: ");
                a = input.nextInt();
                System.out.println(faktoriyel(a));
            }
            case 7 -> {
                System.out.print("Bölünen Sayı Gir: ");
                a = input.nextInt();
                System.out.print("Bölen Sayı Gir: ");
                b = input.nextInt();
                System.out.println(modalma(a, b));
            }
            case 8 -> {
                System.out.print("a kenarını gir: ");
                a = input.nextInt();
                System.out.print("b kenarını gir: ");
                b = input.nextInt();
                System.out.println(alancevre(a, b));
            }
            default -> System.out.println("Geçersiz Seçim Yaptınız...");
        }

    }
}