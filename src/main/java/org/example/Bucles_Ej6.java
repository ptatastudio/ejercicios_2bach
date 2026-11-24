import java.util.Scanner;

public class Bucles_Ej6 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero para ver el factorial: ");
        int n = in.nextInt();
        System.out.print(n + "! = ");
        int count = 1;

        //Bucle de multiplicar
        for (int i= n; i >=1; i--){
            if (i == 1){
                System.out.print(i + " = ");
            }else{
                System.out.print(i + "*");

            }
            count = count*i;
        }

        //Mostrar resultado
        System.out.print(count);
    }
}