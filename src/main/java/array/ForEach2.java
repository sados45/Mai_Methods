package array;

public class ForEach2 {

    public static void main(String[] args) {
        int[] list = {1, 2, 4, 8, 9};
        int sum = 0;
        for (int i : list) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println("==============");


        String[] cars = {"BMW","Mercedes", "Kia"};
        for (String str:cars){
            System.out.println(str);
        }

        System.out.println("==============");
        int[][] matris ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        for (int i =0; i<matris.length; i++){
            for (int n=0; n<matris[i].length; n++){
                System.out.print(matris[i][n] + " ");
            }
            System.out.println();
        }

        System.out.println("==============");

        for (int[] row : matris){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("=================");

        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }



    }
}

