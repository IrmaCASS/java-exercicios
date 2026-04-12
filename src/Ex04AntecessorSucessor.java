import java.util.Scanner;
public class Ex04AntecessorSucessor {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=====DESCUBRA O ANTECESSOR E O SUCESSOR!=====");
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        System.out.println("O número digitado foi: " + numero);
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O antecessor de "  + numero + " é o número " + antecessor + " e o seu sucessor é " + sucessor);
        System.out.println("Agradeçemos por usarem nossos serviços hoje!");


    }
}
