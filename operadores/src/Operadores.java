public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);


        //Debbugar codigo abaixo
        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);


        //Operador Unário

        int numero = 5;
       

        System.out.println(- numero); //numero = - numero;

        numero = numero * -1;
        System.out.println(numero);

        // Incrimentar ou decrementar ou negar

        int numero = 5;
        boolean variavel = true;
        System.out.println(numero ++); //numero = numero + 1;

        System.out.println(numero --); //numero = numero - 1;

        System.out.println(!variavel); // variavel = !variavel;

    }
}
