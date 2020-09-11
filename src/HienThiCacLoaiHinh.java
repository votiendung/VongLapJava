import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int a = -1;
        Scanner scanner = new Scanner(System.in);
        while (a != 0){
            System.out.println("1. Print the rectangle\n" +
                    "\n" +
                    "2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "\n" +
                    "3. Print isosceles triangle\n" +
                    "\n" +
                    "4. Exit" + "\n" +
                    "Input number :" + "\n"
            );
            a = scanner.nextInt();
            int b = 0;
            int c = 0;
            switch (a){
                case 1 :
                    System.out.println("Nhap vao chieu dai");
                    b = scanner.nextInt();
                    System.out.println("Nhap vao chieu rong");
                    c = scanner.nextInt();
                    for (int i = 0; i < c; i++){
                        for (int j = 0; j < b; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2 :
                    System.out.println("Nhap vao chieu dai");
                    b = scanner.nextInt();
                    for (int i = 0; i < b; i++){
                        for (int j = 0; j < b - i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 0; i < b; i++){
                        for (int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 0; i < b; i++){
                        for (int j = 1; j < b - i; j++){
                            System.out.print("  ");
                        }
                        for (int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 0; i < b; i++){
                        for (int j = 0; j < i; j++){
                            System.out.print("  ");
                        }
                        for (int j = 0; j < b - i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3 :
                    System.out.println("Nhap vao chieu dai");
                    b = scanner.nextInt();
                    for (int i = 0; i < b; i++){
                        for (int j = 0; j < b - i; j++){
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4 :
                    System.exit(0);
                    break;
            }
        }
    }
}
