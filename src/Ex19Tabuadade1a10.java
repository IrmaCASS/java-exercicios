import java.util.Scanner;
public class Ex19Tabuadade1a10 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.println("===TABUADA SIMPLES===");
            System.out.println("Tabuada de " + i);

            int j = 1;
            while (j <= 10){
                System.out.println(i + "x" + j + "=" + (i*j));
                j ++;
            }
            System.out.println();
            i++;
        }
    }
}
