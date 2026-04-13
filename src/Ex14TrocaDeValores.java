import java.util.Scanner;
public class Ex14TrocaDeValores {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(">>>INVERSÃO DE VALORES<<<");
        System.out.println("Vamos trocar os valores de A e B!");
        System.out.println("Insira o valor de A: ");
        int valorA = sc.nextInt();
        System.out.println("Insira o valor de B: ");
        int valorB = sc.nextInt();
        System.out.println("O valor de A: " + valorA + " e valor de B: " + valorB);
        int temp = valorA;
        valorA = valorB;
        valorB = temp;
        System.out.println("Os valores após a trocar são A: " + valorA + " e B: " + valorB);

    }
}
