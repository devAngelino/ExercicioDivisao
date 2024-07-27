package Main;

import java.util.Scanner;

public class ExercicioDivisao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        var numerador = sc.nextInt();

        System.out.println("Informe o denominator: ");
        var denominator = sc.nextInt();

        try{
            int resultado = numerador/denominator;
            System.out.println("Resultado da divisão: " + resultado);
        }
        catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida.");
        }















        sc.close();
    }
}
