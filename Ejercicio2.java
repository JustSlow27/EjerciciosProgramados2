import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();
        if (num % num2 == 0) {
            System.out.println(num + " es multiplo de " + num2);
        } else {
            System.out.println(num + " no es multiplo de " + num2);
        }
    }


}