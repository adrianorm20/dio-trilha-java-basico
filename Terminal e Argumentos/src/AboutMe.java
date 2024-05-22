public class AboutMe {

    /**
     * Usando PowerShell e acessando a pasta bin e executando o arquivo .class "AboutMe" consigo adicionar os parametros externos para
     * executar o codigo abaixo.
     * @param args
     */
    public static void main(String[] args) {
        String nome = args [0];
        String  sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + "  " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
    }
}
