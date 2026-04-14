import java.util.Scanner;
public class Ex01SomaEntreAeBMaiorQueC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("=====COMPARADOR DE NÚMEROS=====");
        System.out.println("Digite o número correspondente a A: ");
        double A = sc.nextDouble();
        System.out.println("Digite o número correspondente a B: ");
        double B = sc.nextDouble();
        System.out.println("Digite o número correspondente a C: ");
        double C = sc.nextDouble();

        double Soma = A + B;
        System.out.printf("A soma de A e B é igual a: %.2f%n", Soma);

        if(Soma < C) {
            System.out.println("A soma de A e B é menor do que C");
        }else{
            System.out.println("C é maior do que a soma entre A e B");
        }
    }
}
