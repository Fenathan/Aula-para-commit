import java.util.Scanner;

public class VerificadorDePrimos {

    public static boolean is_prime(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
,
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo:");
        int numero = sc.nextInt();

        if (is_prime(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        sc.close();
    }
}
