import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту треугольника: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("*"); 
            }
            System.out.println(); 
        }

        scanner.close(); 
    }
}
