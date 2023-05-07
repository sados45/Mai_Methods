package methods;

import java.util.Scanner;

public class PalindromCounts {


    // Palindrom sayı : sayının normal okunuşu ile tersten okunuşu aynıysa o sayı palindrom sayıdır.

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNumber;
        while (temp != 0){
            lastNumber = temp %10;   //bir sayinin 10 a bölümünden kalan bulunur.
            reverseNumber = (reverseNumber * 10) + lastNumber; // burasi cok önemli, sayiyi 10 ile carpip üzerine yine ayni sayiyi ekliyor sirayla.
            temp /= 10;  //Bir sayinin 10 bölümüyle elde edilen sayidir.
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(1818));
    }
}




