public class AlgortihmExample {

    public static void main(String[] args) {


    [22,27,16,2,18,6] -> Insertion Sort

        Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

        Big-O gösterimini yazınız.

        Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

        Average case: Aradığımız sayının ortada olması
        Worst case: Aradığımız sayının sonda olması
        Best case: Aradığımız sayının dizinin en başında olması.
.



[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

     
                [22, 27, 16, 2, 18, 6] dizisinin Insertion Sort'a göre aşamaları:

        Adım: [22, 27, 16, 2, 18, 6]
        Adım: [16, 22, 27, 2, 18, 6]
        Adım: [2, 16, 22, 27, 18, 6]
        Adım: [2, 16, 18, 22, 27, 6]
        Adım: [2, 6, 16, 18, 22, 27]
        Big-O gösterimi: O(n^2)

        Time Complexity: Dizi sıralandıktan sonra 18 sayısı Worst case'a girer.

                [7, 3, 5, 8, 2, 9, 4, 15, 6] dizisinin Selection Sort'a göre ilk 4 adımı:

        Adım: [2, 3, 5, 8, 7, 9, 4, 15, 6]
        Adım: [2, 3, 5, 8, 7, 9, 4, 15, 6]
        Adım: [2, 3, 4, 8, 7, 9, 5, 15, 6]
        Adım: [2, 3, 4, 5, 7, 9, 8, 15, 6]



        [16,21,11,8,12,22] -> Merge Sort

        Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
                Big-O gösterimini yazınız.

                [16, 21, 11, 8, 12, 22] dizisinin Merge Sort'a göre aşamaları:

        Adım: [16, 21, 11] [8, 12, 22]
        Adım: [16] [21, 11] [8] [12, 22]
        Adım: [16] [11, 21] [8] [12, 22]
        Adım: [11, 16, 21] [8] [12, 22]
        Adım: [8, 11, 16, 21] [12, 22]
        Adım: [8, 11, 12, 16, 21, 22]
        Big-O gösterimi: O(n log n)


                [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

        Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

                [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree (BST) aşamaları:

        Adım: 7(root)
                Adım: 7(root) - 5(sol), 8(sag)
                Adım: 7(root) - 5(sol) - 1(sol), 8(sag)
                Adım: 7(root) - 5(sol) - 1(sol) - 0(sol), 8(sag)
                Adım: 7(root) - 5(sol) - 1(sol) - 0(sol), 8(sag) - 3(sol)
                Adım: 7(root) - 5(sol) - 1(sol) - 0(sol), 8(sag) - 3(sol) - 6(sag)
                Adım: 7(root) - 5(sol) - 1(sol) - 0(sol), 8(sag) - 3(sol) - 6(sag) - 4(sol)
                Adım: 7(root) - 5(sol) - 1(sol) - 0(sol), 8(sag) - 3(sol) - 6(sag) - 4(sol) - 2(sol)
                Adım: 7(root) - 5(sol) - 1(sol) - 0(sol), 8(sag) - 3(sol) - 6(sag) - 4(sol) - 2(sol) - 9(sag)
                Adım: 7(root) - 5(sol) - 1(sol) - 0(sol), 8(sag) - 3(sol) - 6(sag) - 4(sol) - 2(sol) - 9(sag)
                BST'de her düğüm, solunda kendisinden daha küçük değerlere ve sağından kendisinden daha büyük değerlere sahip olmalıdır. Yukarıdaki aşamalarda verilen dizinin elemanları bu kurala uygun bir şekilde BST'ye yerleştirildi.

    }
}
