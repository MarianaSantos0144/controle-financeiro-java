import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        double gasto = 0;
        String descricao;
        double entrada = 0;
        double saldoInicial;
        double saldo;
        int operacoesGasto = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o saldo que está disponível em sua conta: ");
        saldoInicial = sc.nextDouble();
        saldo = saldoInicial;

        boolean continuar = true;

        while (continuar) {



            System.out.println("======== MENU ============");
            System.out.println(" (1) Registrar gasto.");
            System.out.println(" (2) Registrar entrada.");
            System.out.println(" (3) Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {

                boolean repetir = true;
                while(repetir) {

                    System.out.println("Digite o valor que foi gasto: ");
                    gasto = sc.nextDouble();
                    if (gasto <= 0) {
                        System.out.println("Valor inserido invalido!");
                    }else {
                        repetir = false;
                    }
                }


                saldo = saldo - gasto;

                boolean reperir1 = true;
                while (reperir1 == true ) {
                    System.out.println("Descreva o gasto: ");
                    sc.nextLine();
                    descricao = sc.nextLine();
                    if (descricao.isEmpty()){
                        System.out.println("Descrição não insirida!");
                    } else {
                        reperir1 = false;
                    }
                }



                System.out.println("Seu saldo atual é: " + saldo);


            } else if (opcao == 2) {

                while(entrada <= 0) {
                    System.out.println("Digite o valor de entrada: ");
                    entrada = sc.nextDouble();
                   if (entrada <= 0 ) {
                       System.out.println("Valor inserido invalido!");
                   }
                }
                saldo = saldo + entrada;
                System.out.println("Seu saldo atual é: " + saldo);

            } else if (opcao == 3) {
                System.out.println("Saindo ... ");
                continuar = false;
            } else {
                System.out.println("Opção inválida!");
            }

        }
    }
}
