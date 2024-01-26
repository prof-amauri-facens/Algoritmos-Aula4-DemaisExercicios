import java.util.Scanner;

public class DemaisExercicios {
    public static void main(String[] args) {

        /* Exercicio 1*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de horas: ");
        int horas = scanner.nextInt();

        // Converte horas para minutos (1 hora = 60 minutos)
        int minutos = horas * 60;

        // Exibe o resultado
        System.out.println(horas + " horas equivalem a " + minutos + " minutos.");

        // Fecha o scanner para evitar vazamento de recursos

        System.out.println("#################################");

        /* Exercicio 2*/

        // Solicita ao usuário que insira a idade em anos
        System.out.print("Digite a idade em anos: ");
        int idadeAnos = scanner.nextInt();

        // Converte idade em anos para dias (considerando 1 ano = 365 dias)
        int idadeDias = idadeAnos * 365;

        // Exibe o resultado
        System.out.println("A idade de " + idadeAnos + " anos equivale a aproximadamente " + idadeDias + " dias.");


        System.out.println("#################################");

        /* Exercicio 3*/

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Calcula o quadrado do número
        double quadrado = numero * numero;

        // Exibe o resultado
        System.out.println("O quadrado de " + numero + " é: " + quadrado);


        System.out.println("#################################");

        /* Exercicio 4*/

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Calcula o módulo dos dois números
        int modulo = primeiroNumero % segundoNumero;

        // Exibe o resultado
        System.out.println("O módulo de " + primeiroNumero + " e " + segundoNumero + " é: " + modulo);

    }
}