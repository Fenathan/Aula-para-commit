import java.util.Scanner;

public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }
,
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");a
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + somar(a, b));
                break;
            case 2:
                System.out.println("Resultado: " + subtrair(a, b));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(a, b));
                break;
            case 4:
                try {
                    System.out.println("Resultado: " + dividir(a, b));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}