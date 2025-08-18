package org.example;
import java.util.Scanner;

//testar
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();
        Conta conta = banco.criarConta(nome);
        while (true) {
            System.out.println("\n1 - Ver saldo\n2 - Depositar\n3 - Sacar\n4 - Sair");
            String op = sc.nextLine();
            switch (op) {
                case "1":
                    System.out.println("Saldo de " + conta.getTitular() + ": R$ " + conta.getSaldo());
                    break;
                case "2":
                    System.out.print("Valor: ");
                    conta.depositar(Double.parseDouble(sc.nextLine()));
                    break;
                case "3":
                    System.out.print("Valor: ");
                    double valor = Double.parseDouble(sc.nextLine());
                    if (!conta.sacar(valor)) {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case "4":
                    System.out.println("Obrigado! Volte Sempre");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
