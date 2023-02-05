import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a hora inicial");
        int hIni = sc.nextInt();

        System.out.println("Qual é a hora final");
        int hFin = sc.nextInt();

        int hTot = hFin - hIni;

        if(hTot > 0) {
            System.out.println("O JOGO DUROU " + hTot + " HORA(S)");
        }
        else if(hTot < 0) {

            System.out.println("O JOGO DUROU " + (hTot + 24) + " HORA(S)");
        }
        else if(hTot == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");

        }
        sc.close();
    }

}

