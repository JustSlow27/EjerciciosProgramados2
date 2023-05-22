import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num3 = sc.nextInt();
        if (num > num2 && num > num3) {
            if (num2 > num3) {
                System.out.println(num + " " + num2 + " " + num3);
            } else {
                System.out.println(num + " " + num3 + " " + num2);
            }
        } else if (num2 > num && num2 > num3) {
            if (num > num3) {
                System.out.println(num2 + " " + num + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num);
            }
        } else if (num3 > num && num3 > num2) {
            if (num > num2) {
                System.out.println(num3 + " " + num + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num);
            }
        }
    }
}