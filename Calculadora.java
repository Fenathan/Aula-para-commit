import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Uma calculadora simples que opera via terminal.
 * O usuário informa dois números e um operador (+, -, *, /)
 * e o programa exibe o resultado da operação.
 */
public class Calculadora {

    public static void main(String[] args) {
        // Objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operador;

        try {
            // Solicita e lê o primeiro número
            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();

            // Solicita e lê o operador
            System.out.print("Digite o operador (+, -, *, /): ");
            operador = scanner.next().charAt(0);

            // Solicita e lê o segundo número
            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();

            // Realiza o cálculo com base no operador
            switch (operador) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    // Verifica a divisão por zero
                    if (numero2 == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        return; // Encerra o programa
                    }
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operador inválido. Use +, -, *, ou /.");
                    return; // Encerra o programa
            }

            // Exibe o resultado formatado
            System.out.printf("Resultado: %.2f %c %.2f = %.2f\n", numero1, operador, numero2, resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números válidos.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}