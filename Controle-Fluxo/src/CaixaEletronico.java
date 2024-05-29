public class CaixaEletronico {
    
    public static void main(String[] args) {
     /* double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){  //Condicional Simples
            saldo = saldo - valorSolicitado;
        }
                
        System.out.println(saldo);
    }
 */   

        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){ //Condicional Composta
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }  
        else
            System.out.println("Saldo insuficiente");
    }
}
