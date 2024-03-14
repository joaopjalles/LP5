import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDigite o salário: ");
        double salario = scn.nextDouble();
        double gratificacao = salario * 0.05;
        double novoSalario = salario + gratificacao;
        double imposto = novoSalario * 0.07;
        double novoSalarioDescontado = novoSalario - imposto;
        System.out.println("Sua gratificação foi de 5%: " + gratificacao);
        System.out.println("Seu novo salário com a gratificação é: " + novoSalario);
        System.out.println("O imposto de 7% será de: " + imposto);
        System.out.println("Seu novo salário descontado do imposto é: " + novoSalarioDescontado);
    }
}
