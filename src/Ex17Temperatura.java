import java.util.Scanner;
public class Ex17Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println(">>>>CORRESPONDENTE DE FAHRENHEIT EM CELSIUS<<<<");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaF = sc.nextDouble();
        double temperaturaC = (5 * ( temperaturaF -32) / 9);
        System.out.printf("A temperatura em Fahrenheit: %.2f - Corresponde a temperatura em Celsius: %.2f%n", temperaturaF, temperaturaC);
    }
}
