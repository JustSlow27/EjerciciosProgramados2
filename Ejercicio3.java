import java.util.scanner;

public class nummayorqueotro { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();
        if (num > num2) {
            System.out.println(num + " es mayor que " + num2);
        } else if (num < num2) {
            System.out.println(num + " es menor que " + num2);
        } else {
            System.out.println(num + " es igual a " + num2);
        }
    }

}