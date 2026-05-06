import java.util.Scanner;
public class Ex18FranciscoeSaraAltura {
    public static void main(String[] args) {
        System.out.println("Francisco tem 1,50m e cresce 2 centímetros por ano,enquanto Sara tem 1,10m e cresce 3 centímetros por ano.");
        System.out.println("Quantos anos são necessários para Sara alcançar Francisco?");
        double alturaF = 1.50;
        double crescimentoF = 0.02;
        double alturaS = 1.10;
        double crescimentoS = 0.03;
        int anos = 0;

        while (alturaS <= alturaF){
            alturaF += crescimentoF;
            alturaS += crescimentoS;
            anos++;
        }
        System.out.println("Sara irá ultrapassar Francisco em " +anos+ " anos");

    }
}
