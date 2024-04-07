import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Jefferson Dev";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        double soma = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                \nOperações
                
                ** Digite sua opção **
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                """;

        while(opcao != 4){
            System.out.print(menu);
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.printf("O saldo atual é: %.2f", saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: " );
                    soma = sc.nextDouble();
                    saldo += soma;
                    System.out.printf("O saldo atual é: %.2f", saldo);
                    break;
                case 3:
                    System.out.print("Informe o valor de transferência: ");
                    double transf = sc.nextDouble();
                    saldo -= transf;
                    System.out.printf("O saldo atual é: %.2f", saldo);
                    break;
                default:
                    System.out.println("\nNúmero incorreto!");

            }
            if (opcao == 4){
                System.out.println("Você saiu.");
            }

        }

    }
}