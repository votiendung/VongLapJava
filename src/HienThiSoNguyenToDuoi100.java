import java.util.Scanner;

public class HienThiSoNguyenToDuoi100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap num");
        int num = sc.nextInt();
        for (int i =2; i <= num; i++) {
            if (isPremi(i)){
                System.out.println(i);
            }

        }
    }

    public static boolean isPremi(int number) {
        boolean result = true;
        if(number < 2) {
            result = false;
        }
        if (number >=2) {
            for (int i = 2; i < Math.sqrt(number); i++){
                if (number%i == 0)
                result = false;
            }
        }
        return  result;
    }

}
