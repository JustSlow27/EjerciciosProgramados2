import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        while (num != 0) {
            if (num > 0) {
                System.out.println("El numero es positivo");
            } else {
                System.out.println("El numero es negativo");
            }
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
        }
    }
    
}
