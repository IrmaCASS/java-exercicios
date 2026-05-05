import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex07VerificarBooleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("=====VERIFICADOR DE BOOLEANOS=====");
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        if(valor1 == 1 && valor2 == 1){
            System.out.println("Verdadeiro");
        }else if (valor1 == 1 && valor2 == 0){
            System.out.println("O primeiro valor é verdadeirto e o segundo valor é falso");
        }else if (valor1 == 0 && valor2 == 1){
            System.out.println("O primeiro valor é falso e o segundo valor é verdadeiro");
        }else{
            System.out.println("Os dois valores são falsos");
        }
    }
}
