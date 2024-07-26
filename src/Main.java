import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor de 1 a 8: ");
        //esse codigo verifica se uma conta tem exatamente 8 caracteres
        Scanner scanner = new Scanner(System.in);
        String numeroConta = scanner.nextLine(); //tem que ficar antes do
                                                //try pra ele ler antes do loop e fazer a verificacao la embaixo na class


        try {
            verificarNumeroConta(numeroConta); //aqui ele entra no verificar o numero da conta
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());// aqui ele vai verificar a condicao e ver se passa ou nao
        }
    }
    public static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException ("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } else {
            throw new IllegalArgumentException("Numero de conta valido.");
        }
    }
}
