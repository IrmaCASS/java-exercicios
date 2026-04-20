import java.util.Scanner;
public class Ex03IguaisSomaEDiferentesMultiplica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>VAMOS CALCULAR<<<<<");
        System.out.println("Insira dois números inteiros para serem correspondentes a A e B, respectivamente");
        System.out.println("Caso os números sejam iguais somaremos os dois e caso eles sejam diferentes iremos multiplica-los");
        System.out.println("Digite o primeiro número:");
        if(!sc.hasNextInt()){
            System.out.println("ERRO: O valor digitado não é um número inteiro");
            return;
        }
        int numA = sc.nextInt();

        System.out.println("Digite o segundo número:");
        if(!sc.hasNextInt()){
            System.out.println("ERRO: O valor digitado não é um número inteiro");
            return;
        }
        int numB = sc.nextInt();

        if(numA == numB){
            int numC = numA + numB;
            System.out.printf("A = %d %n", numA);
            System.out.printf("B = %d %n", numB);
            System.out.printf("%d + %d = %d %n", numA, numB, numC);
            System.out.printf("C = %d", numC);
        }else{
            int numC = numA * numB;
            System.out.printf("A = %d %n", numA);
            System.out.printf("B = %d %n", numB);
            System.out.printf("%d * %d = %d %n", numA, numB, numC);
            System.out.printf("C = %d %n", numC);
        }
    }

}
