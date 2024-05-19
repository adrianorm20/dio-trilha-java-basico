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


        //Operador Ternário

        int a,b;
        a=5;
        b=6;

        String resultado = ""; // String resultado = a==b ? "verdadeiro" : "falso";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);


        //Relacionais


        //Comparar entre dois objetos


        String nomeUm = "Adriano";
        String nomeDois = new String("Adriano");

        System.out.println(nomeUm.equals(nomeDois));




        int numero1 = 1;
        int numero2 = 2;

        //outro método

        if(numero1 < numero2){
            System.out.println("a condição é verdadeira ");
        }


        boolean simNao = numero1 == numero2; //igual
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2; //diferente

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2; // maior que

        System.out.println("numeroUm é maior que numeroDois? " + simNao);




        // Lógicos

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
