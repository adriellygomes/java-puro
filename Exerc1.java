
package exerc1;

import java.util.Scanner;

public class Exerc1 {
    //formula para conversão
    static double ConversaoCelsiusFahreheit(double C){
        return 9 * C  / 5 + 32;
    }

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       //pegando o valor da temperatura
       
       System.out.println("Digite um numero em Celsius: ");
       double celsius = leitor.nextInt();
        System.out.println("O numero convertido em Farhreheit é: ");
        System.out.println(ConversaoCelsiusFahreheit(celsius));
    }
    
}
 