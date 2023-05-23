import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int negativos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            if (num < 0) {
                negativos++;
            }
        }
        System.out.println("Hay " + negativos + " numeros negativos");
    }
    
}
