import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeDoCliente = "Pablo Henrique Costa Araujo";
        String tipoDaConta = "Conta corente";
        double saldoBancario = 1000.00;
        int opcao = 0;
        double valorDigitado = 0;

        System.out.println("""
                
                ************************
                
                       Conta Corente
               \s
               Nome:\s    """ + nomeDoCliente);

        System.out.println("Tipo da conta:  " + tipoDaConta);
        System.out.println("Saldo Bancario: " + saldoBancario );

        while (opcao != 4){

            if (opcao == 3){
                System.out.println("Saldo disponivel de " + saldoBancario);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a reeceber");
                valorDigitado = leitura.nextDouble();
                saldoBancario = valorDigitado + saldoBancario;
            } else if (opcao == 1) {
                System.out.println("Digite o valor a ser enviado");
                valorDigitado = leitura.nextDouble();
                    if (valorDigitado > saldoBancario) {
                        System.out.println("Valor indisponivel!");
                    } else {
                saldoBancario = saldoBancario - valorDigitado;
            }} else if (opcao != 4) {
                System.out.println("Opção invalida");
            }

            System.out.println("""
                
                ************************
                
                        Opiçoes De Transferencias
                                                
                1 - Enviar Pix
                2 - Receber PIx
                3 - Consultar saldo Bancario
                4 - Sair     
                           
                ************************
                """);
        opcao = leitura.nextInt();
        }


    }
}
