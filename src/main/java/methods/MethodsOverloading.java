package methods;

public class MethodsOverloading {

    static void print() {

        System.out.println("Parametresiz Metot");
    }

    static void print(int a) {

        System.out.println("Parametreler  :" + a);

    }

    static int print(int a, int b) {

        return a + b;

    } // burada int yapisini kullandigimiz icin yük olusturmadi.


    public static void main(String[] args) {

        print();
        print(12);
        System.out.println(print(2, 3));


    }
}
