import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        numNum(a, b, n);


    }
    public static void numNum (int a, int b, int n){
        int c = a * n;
        int d = b * n % 100;
        int num = b * n / 100;
        c += num;
        System.out.println(c + " " + d);
    }
}