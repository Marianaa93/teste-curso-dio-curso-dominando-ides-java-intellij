package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro número:");
        a= scan.nextInt();
        System.out.println("Digite o segundo número");
        b= scan.nextInt();

        int soma = soma(a, b);
        int subtrai = subtrai(a, b);
        int multiplica = multiplica(a, b);
        int divide = divide(a, b);

        System.out.println("Soma: "+ soma);
        System.out.println("Subtrai: "+ subtrai);
        System.out.println("Multiplica: "+ multiplica);
        System.out.println("Divide: "+ divide);

    }


    public static int soma(int a, int b) {
        return a+b;
    }
    public static int subtrai(int a, int b) {
        return a-b;
    }
    public static int multiplica(int a, int b) {
        return a*b;
    }
    public static int divide(int a, int b) {
        return a/b;
    }

}
