import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap number");
        int number = sc.nextInt();
        int count = 1;

        System.out.println(isPrime(number));

        for (int i = 2; count <= number; i++) {
            if (isPrime(i)){
                System.out.print(i + "  ");
                count++;

            }
        }

//        for (int i = 2;count < number; i++) {
//            if (isPrime(number)){
//                System.out.println(i + "  ");
//                count++;
//            }
//        }

    }

    public static boolean isPrime(int num) {
        boolean result = true;
        if (num < 2) {
            result = false;
        }
        if (num > 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }
}
