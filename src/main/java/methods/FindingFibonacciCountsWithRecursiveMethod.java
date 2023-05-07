package methods;
import java.util.Scanner;
public class FindingFibonacciCountsWithRecursiveMethod {

    public static int fib(int n){
        if(n==1 || n==2){
            return 1;}
        return fib(n-1) + fib(n-2); // burada fibonacci sayilari 1 1 2 3 5 8 13 diye gidiyor. formülde bir onceki sayi n-1 oluyor. 5 öncesindeki sayi 3 yani 5-3 oluyor. n-2 ise 3 ten de önceki sayi olan 2 dir.
    }
    public static void main(String[] args) {

        int sayi= 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("kaçıncı basamağın değerini ögrenmek istiyorsun: ");
        sayi= inp.nextInt();
        System.out.println(fib(sayi));
    }
}

