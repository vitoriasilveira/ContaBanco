package dio.javabasico.contaterminal;

import java.util.Scanner;

/**
 *
 * @author vitoriasilveira
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o nome completo: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero da Agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero da Conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o saldo inicial: ");
        float saldo = scanner.nextFloat();
        
        System.out.println("Ola, " + nomeCliente
                +", obrigado por criar uma conta em nosso banco. Sua agencia e " + agencia
                +" conta " + numero
                +" e seu saldo R$" + saldo
                +" ja esta disponivel para saque.");
    }
    
}
