package exerc2;

import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Declarando váriaveis
        String sexo;
        double salario;
        int tempoCasa;

        //Lendo valores do usuário
        System.out.println("Qual seu sexo? Digite: (M = Mulher | H = Homem");
        sexo = scanner.nextLine();

        System.out.println("Qual seu salário?");
        salario = scanner.nextDouble();

        System.out.println("Quanto tempo você tem de casa?");
        tempoCasa = scanner.nextInt();

        if (sexo.equalsIgnoreCase("Homem") || sexo.equalsIgnoreCase("H")
                && tempoCasa >= 15) {
            salario += (salario * 0.25);
        } else if (sexo.equalsIgnoreCase("Mulher") || sexo.equalsIgnoreCase("M")
                && tempoCasa >= 10) {
            salario = salario + (salario * 0.30);
        } else {
            salario += 500;
        }
         
        //resultado do bonus: salario + bonus 
        System.out.println("Seu bonus foi de " + salario);
    }
}

