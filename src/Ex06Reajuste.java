import java.util.Scanner;
public class Ex06Reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Olá! Vamos calcular o reajuste de 5% de qualquer número hoje.");
        System.out.println("Insira o valor desejado: ");
        double valor = sc.nextDouble();
        double reajuste = valor * 1.05;
        System.out.printf("O valor reajustado é igual a: %.2f%n", reajuste);

    }

}
