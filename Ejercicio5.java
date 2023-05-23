public class Ejercicio5 {
    public static void main(String[] args) {
        int num = 9999;
        int cifras = 0;
        while (num != 0) {
            num = num / 10;
            cifras++;
        }
        System.out.println("El numero tiene " + cifras + " cifras");
    }
    
}
