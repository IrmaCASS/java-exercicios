import java.util.Scanner;
public class Ex22QuocienteERestoDaDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>CALCULADORA DE DIVISÃO<<<<");
        System.out.println("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();
        double quociente = numero1 / numero2;
        double resto = numero1 % numero2;
        System.out.printf("O quociente da divisão é: %.2f. E o resto da divisão é: %.2f%n", quociente, resto);
    }
}
