import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese un anio: ");
        int anio = sc.nextInt();
        if (dia > 31 || dia < 1) {
            System.out.println("El dia ingresado no es valido");
        } else if (mes > 12 || mes < 1) {
            System.out.println("El mes ingresado no es valido");
        } else if (anio < 0) {
            System.out.println("El anio ingresado no es valido");
        } else {
            System.out.println("La fecha ingresada es valida");
        }
    }
    
}
