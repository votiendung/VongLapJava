import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[2][2];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");

        int total = 0;

        for (int row = 0; row < matrix.length; row++) {
            int totalCol = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
//                System.out.print(matrix[row][column] + " ");


                total += matrix[row][column];
                totalCol += matrix[row][column];


            }
            System.out.print(totalCol + " ");

//            System.out.println();
        }
        System.out.print(total + " ");

    }
    }


