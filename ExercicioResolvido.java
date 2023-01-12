package com.company;

import java.util.Scanner;

public class ExercicioResolvido {

    package com.company;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);

            int par = 0, impar = 0, num;


            for (int i = 1; i <= 10; i++) {
                System.out.println("Digite o numero " + i + " para verificar se é par ou impar");
                num = ler.nextInt();


                if (num % 2 == 0) {
                    par ++;


                } else {
                    impar ++;


                }
}

            //Exercicio2



  

            public class IdadePessoas {

                public static void main(String[] args) {

                    int idade1 = 0;
                    int armidade = 0;
                    int armidade2 = 0;
                    int soma = 0;

                    Scanner ler = new Scanner(System.in);

                    while (idade1 >= 0) {
                        System.out.println("digite sua idade");
                        idade1 = ler.nextInt();

                        if (idade1 > 50) {
                            armidade ++;

                        } else if (idade1 < 21) {
                            armidade2++;

                        }



                    }
                    System.out.println("Programa finalizado " );

                    System.out.println("O numero de pessoas com idade menor que 21 é " + (armidade2 -1));
                    System.out.println("O numero de pessoas com idade maior que 50 é " + armidade);

                }
            }



//Exercicio 5

        package com.company;

import java.util.Scanner;

            public class SomaValores {

                public static void main(String[] args) {

                    int n1 = 0;

                    int soma1 = 0;

                    Scanner ler = new Scanner(System.in);


                    do {
                        System.out.println("digite um valor para soma ");
                        n1 = ler.nextInt();

                        if (n1 > 0) {
                            soma1 += n1;

                        }


                    }
                    while (n1 != 0);


                    System.out.println("Programa finalizado ");

                    System.out.println("A quantidade de numeros digitados é " + (soma1));


                }
            }
