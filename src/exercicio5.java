import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva com codigo");
        float x = sc.nextFloat();

        System.out.println("Qual a quantidade");
        float y = sc.nextFloat();

        if(x == 1) {
            System.out.printf("Total: R$ %.2f%n" , (y * 4.00));
        }
        else if(x == 2) {
            System.out.printf("Total: R$ %.2f%n" , (y * 4.50));
        }
        else if(x == 3) {
            System.out.printf("Total: R$ %.2f%n" , (y * 5.00));
        }
        else if(x == 4) {
            System.out.printf("Total: R$ %.2f%n" , (y * 2.00));
        }
        else if(x == 5) {
            System.out.printf("Total: R$ %.2f%n" , (y * 1.50));
        }

        sc.close();
    }

}
