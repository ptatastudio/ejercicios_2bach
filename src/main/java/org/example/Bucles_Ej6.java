import java.util.Scanner;

public class Bucles_Ej6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres sumar?: ");
        int n = teclado.nextInt();
        System.out.print(n + "! = ");
        int contador = 1;
        for (int i= n; i >=1; i--){
            if (i == 1){
                System.out.print(i + " = ");
            }else{
                System.out.print(i + "*");

            }
            contador = contador*i;
        }
        System.out.print(contador);
    }
}