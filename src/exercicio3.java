import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int z = x / y;
        int a = y / x;

        if(x == y * z || y == x * z) {
            System.out.println("SAO MULTIPLOS");
        }
        else if (x == y * a || y == x * a) {
            System.out.println("SAO MULTIPLOS");
        }
        else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();
    }

}
