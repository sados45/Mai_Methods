package array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MayinTarlasiOyunu {



        private int rows;
        private int cols;
        private char[][] board;
        private boolean[][] mines;
        private int totalMines;

        public MayinTarlasiOyunu(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            this.board = new char[rows][cols];
            this.mines = new boolean[rows][cols];
            this.totalMines = rows * cols / 4;
        }

        public void placeMines() {
            int count = 0;
            Random random = new Random();

            while (count < totalMines) {
                int row = random.nextInt(rows);
                int col = random.nextInt(cols);

                if (!mines[row][col]) {
                    mines[row][col] = true;
                    count++;
                }
            }
        }

        public void printBoard() {
            for (char[] row : board) {
                System.out.println(Arrays.toString(row));
            }
        }

        public int[] getUserInput() {
            Scanner scanner = new Scanner(System.in);
            int[] input = new int[2];

            System.out.print("Satır Giriniz: ");
            input[0] = scanner.nextInt();

            System.out.print("Sütun Giriniz: ");
            input[1] = scanner.nextInt();

            return input;
        }

        public boolean isValidMove(int row, int col) {
            return row >= 0 && row < rows && col >= 0 && col < cols;
        }

        public boolean updateBoard(int row, int col) {
            if (mines[row][col]) {
                printBoard();
                System.out.println("Game Over!!");
                return false;
            }

            int count = 0;
            int[][] directions = {
                    {0, 1}, {0, -1}, {1, 0}, {-1, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
            };

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (isValidMove(newRow, newCol) && mines[newRow][newCol]) {
                    count++;
                }
            }

            board[row][col] = (char) (count + '0');
            return true;
        }

        public void playGame() {
            placeMines();
            System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
            printBoard();

            while (true) {
                int[] input = getUserInput();
                int row = input[0];
                int col = input[1];

                if (!isValidMove(row, col)) {
                    System.out.println("Geçersiz bir hamle, lütfen tekrar giriniz.");
                    continue;
                }

                if (!updateBoard(row, col)) {
                    break;
                }

                printBoard();

                int remainingCells = 0;
                for (char[] rowArr : board) {
                    for (char cell : rowArr) {
                        if (cell == '-') {
                            remainingCells++;
                        }
                    }
                }

                if (remainingCells == totalMines) {
                    System.out.println("Oyunu Kazandınız !");
                    break;
                }
            }
        }

        public static void main(String[] args) {
            MayinTarlasiOyunu game = new MayinTarlasiOyunu(3, 3);
            game.playGame();
        }
    }

