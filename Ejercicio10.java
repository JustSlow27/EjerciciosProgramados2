import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            suma = suma + num;
        }
        System.out.println("La suma total es: " + suma);
    }

    
}
