package classubject;

public class Car {
        /*
        Java Nesne Yönelimli bir programlama dilidir. Java'daki her şey, değişkenleri ve metotları ile birlikte sınıflar ve nesnelerle ilişkilidir. Örneğin: gerçek hayatta araba bir nesnedir. Otomobilin ağırlık ve renk gibi değişkenleri ve sürüş ve fren gibi metotları vardır. Nesne yönelimli programlamanın amacı yazdığımız kodlara soyut bir kavrama dönüştürmektir.

Sınıflara ait nitelikler ve davranışlar vardır. Programlamada nitelikler için değişkenler (variable) ,davranışlar için ise metotlar (method) tanımlanır.
         */

        // nitelikler
        String type;
        String model;
        String color;
        int speed;

        // davranışlar
        int increaseSpeed(int increment) {
            speed += increment;
            return speed;
        }

        int decreaseSpeed(int decrease) {
            if (speed > 0) {
                speed -= decrease;
            }
            return speed;
        }

        void printSpeed() {
            System.out.println("Speed : " + speed);
        }
        // ...Yukarıda sınıf ve fonksiyon tanımlamalarına detaylıca yer verilmiştir.
    //Sınıflar nesneler oluşturabilmek için yazılım dünyasında oluşturulmuş şablonladır. Bu şablon nesne ile ilgili modellenecek tüm özellikleri ve davranışları bir taslak halinde kodlanmasını sağlar. Böylece, tanımlanmış bir sınıftan binlerce nesne oluşturabiliriz.
    }

