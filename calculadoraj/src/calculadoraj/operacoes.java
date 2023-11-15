package calculadoraj;

	import java.util.Scanner;

public class operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, res;
        char operacoes;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite a operação que deseja(+, -, *, /): ");
        operacoes = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        switch (operacoes) {
            case '+':
                res = n1 + n2;
                System.out.println("Resultado: " + res);
                break;
            case '-':
                res = n1 - n2;
                System.out.println("Resultado: " + res);
                break;
            case '*':
                res = n1 * n2;
                System.out.println("Resultado: " + res);
                break;
            default:
                System.out.println("Operação inválida.");
        }

    }
}
