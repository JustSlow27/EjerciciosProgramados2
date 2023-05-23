import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        while (num > 0) {
            System.out.println("El cuadrado de " + num + " es " + (num * num));
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
        }
    }
    
}
