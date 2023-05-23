import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int suma = 0;
        while (num != 0) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            if (num == 0) break;
            suma = suma + num;
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}