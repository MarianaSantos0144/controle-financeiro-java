import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        double gasto;
        String descricao;
        double entrada;
        double saldoInicial;
        double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o saldo que está disponível em sua conta: ");
        saldoInicial = sc.nextDouble();
        saldo = saldoInicial;

        boolean continuar = true;

        while (continuar == true) {



            System.out.println("======== MENU ============");
            System.out.println(" (1) Registrar gasto.");
            System.out.println(" (2) Registrar entrada.");
            System.out.println(" (3) Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor que foi gasto: ");
                gasto = sc.nextDouble();
                saldo = saldo - gasto;

                System.out.println("Descreva o gasto: ");

                descricao = sc.nextLine();
                descricao = sc.nextLine();


                System.out.println("Seu saldo atual é: " + saldo);

            } else if (opcao == 2) {

                System.out.println("Digite o valor de entrada: ");
                entrada = sc.nextDouble();
                saldo = saldo + entrada;

                System.out.println("Seu saldo atual é: " + saldo);

            } else if (opcao == 3) {
                System.out.println("Saindo ... ");
                continuar = false;
            }

        }
    }
}
