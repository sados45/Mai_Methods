package methods;

public class MethodsLocalVariable {

    static void sum(int a, int b){
        a= 5;
        System.out.println(a);
    }

    static void dif(){

        int a = 15;

        System.out.println(a);
    }
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        sum (a,b);
        System.out.println(b);
    }
}
// her  kod blogu icinde lokal olarak degerlendirme olur. birbirine benzer yazilirsa degerlendirme olmaz. bu nedenle yazdirirken buna dikkat edilmeli, verileri buna göre girmeliyiz.