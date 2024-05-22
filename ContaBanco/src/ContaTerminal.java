import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //To do: Scanner
        Scanner respostas = new Scanner(System.in);

       //To do: Exibir as mensagens para o usuário e obter valores
        System.out.println("Por favor, Digite seu nome completo: ");
        String nome = respostas.nextLine();

        System.out.println("Agora digite o numero de sua Agencia: ");
        String agencia = respostas.nextLine();

        System.out.println("Em seguida o numero da sua conta: ");
        int numero = respostas.nextInt();

        System.out.println("Por ultimo o valor de Saldo de sua conta: ");
        Double saldo = respostas.nextDouble();
       
       //To do: Exibir a mensagem final

       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ", conta "+ numero + " e seu saldo "+ saldo + " já está disponível para saque");
    }
}
