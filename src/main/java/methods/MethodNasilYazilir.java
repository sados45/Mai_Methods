package methods;

public class MethodNasilYazilir {

    static int sum (int a, int b){

       return a + b;

         //int result = a + b;

        // return 3; bu sekilde return yanina sayi verilirse, sayiyi kendisiyle topluyor. 3 + 3 = 6 yapiyor.

    }


    public static void main(String[] args) {

        int result = sum(5, 2) + sum (9, 5);
        System.out.println(result);
    }
}
