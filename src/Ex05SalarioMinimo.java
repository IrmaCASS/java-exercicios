import java.util.Scanner;
public class Ex05SalarioMinimo {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("=====CALCULADORA DE SALÁRIOS MÍNIMOS=====");
        System.out.println("Digite o valor do salário mínimo atual: ");
        double salarioMinimo = sc.nextDouble();
        System.out.println("Digite o seu salário atual: ");
        double salarioUsuario = sc.nextDouble();

        double quantidadeDesalarios = salarioUsuario / salarioMinimo;
        System.out.printf("A quantidade de salários mínimos que você recebe é aproximadamente igual a: %.2f%n", quantidadeDesalarios);
    }
}
