import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Em um quadrante diga o valor de x e y");
        System.out.println();

        System.out.println("Valor de x:");
        double x = sc.nextDouble();

        System.out.println("Valor de y:");
        double y = sc.nextDouble();

        if(x > 0 && y >	 0) {
            System.out.println("Q1");
        }
        else if(x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if(x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if(x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if(x == 0 && y == 0) {
            System.out.println("Origem");
        }

        sc.close();
    }

}
