import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============== factors ==============");
        System.out.println("Provide a number to find out their factor ");

// 12 = 2, 3, 4, 6, 12 /2

        int factorNumber = sc.nextInt();
        for (int i = 2; i <= factorNumber; i++) {
            if (factorNumber % i == 0)
                System.out.print(i + "\t");
        }
    }
}



