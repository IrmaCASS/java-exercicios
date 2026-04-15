import java.util.Scanner;
public class ParImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>DESCUBRA SE O NÚMERO É PAR OU IMPAR, NEGATIVOU OU POSITIVO<<<<<");
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if(numero > 0){
            System.out.println("O número é positivo");
        }else if (numero < 0){
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número é zero");
        }

        if(numero % 2 == 0 ){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }


    }
}
