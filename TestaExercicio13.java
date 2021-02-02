package ListaDeExercicio01_Exercicio13;

import java.util.Scanner;

public class TestaExercicio13 {

    public static void main(String[] args) {

        Scanner mes = new Scanner(System.in);
       // mes.useDelimiter("\n");
        System.out.print("Digite um mês (1 a 12):");
        int indexa = mes.nextInt();

        Scanner ano = new Scanner(System.in);
       // ano.useDelimiter("\n");
        System.out.print("Digite um ano:");
        int indexb = ano.nextInt();

        System.out.println(ContaDias.contaDias(indexa,indexb));
        
        mes.close();
        ano.close();

    }
}