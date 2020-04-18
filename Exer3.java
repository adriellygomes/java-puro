package exer3;

import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cont = 0;

        int porcentagem = 0;
        int olho_verdes = 0;

        int ctOlhos = 0;

        double mediaIdade = 0;
        int mIdade = 0;
        int contPeso = 0;

        int pessoaAlta = 0;

        while (cont < 3) {
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Peso: ");
            double peso = input.nextDouble();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            System.out.println(" --- COR DOS OLHOS ---");
            System.out.println("     A - AZUL.");
            System.out.println("     P - Preto.");
            System.out.println("     V - Verde.");
            System.out.println("     C - Castranho.");

            System.out.print("Cor do olho: ");
            char olhos = input.next().charAt(0);
            char upper = Character.toUpperCase(olhos);
            System.out.println("----------------------");
            while (upper != 'A' && upper != 'P' && upper != 'V' && upper != 'C') {
                System.out.print("\033[31mERRO!\033[m Digite uma opção válida: ");
                olhos = input.next().charAt(0);
                upper = Character.toUpperCase(olhos);
            }
            //  A média da idade das pessoas com peso entre 40 e 60 quilos; 
            if (peso >= 40 && peso <= 60) {
                contPeso += 1;
                mIdade = mIdade + idade;
            }
            // A quantidade de pessoas com altura superior a 1,70 m e que não possue olho AZUL;
            if (altura >= 1.70 && olhos != 'A') {
                pessoaAlta += 1;
            }
            // Validação pela cor dos olhos
            switch (upper) {
                case 'A':
                    ctOlhos += 1;
                    break;
                case 'P':
                    ctOlhos += 1;
                    break;
                case 'V':
                    ctOlhos += 1;
                    olho_verdes += 1;
                    break;
                case 'C':
                    ctOlhos += 1;
                    break;
            }

            cont += 1;
            mediaIdade = mIdade / contPeso;
            // A porcentagem de pessoas com olhos VERDES entre todas as pessoas analisadas; 
            porcentagem = olho_verdes * 10;
        }
        System.out.println(ctOlhos);
        System.out.printf("A média de idade das pessoas entre 40kg e 60kg é de %.1f anos \n", mediaIdade);
        System.out.printf("De todas as pessoas analisadas %d%% tem os olhos verdes.     \n", porcentagem);
        System.out.printf("Temos os total de %d pessoas com altura igual ou superior a 1,70 m e que não possue olho AZUL \n", pessoaAlta);
    }

}
