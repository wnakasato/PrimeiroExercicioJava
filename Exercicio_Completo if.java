package com.company;

import java.util.Scanner;

public class Exercicio_Completo {

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);

            int item = 0;
            int quantidade = 0;
            double valor = 0;

            System.out.println("########## ##### #########   Menu Marketplace   ########## ######## ##########\n");

            System.out.println("\n Digite o item 1 para Cachorro-quente 10.00 R$ ");
            System.out.println("\n Digite o item 2 para X-Salada 15.00 R$ ");
            System.out.println("\n Digite o item 3 para X-Bacon 18.00 R$ ");
            System.out.println("\n Digite o item 4 para Bauru 12.00 R$ ");
            System.out.println("\n Digite o item 5 para Refrigerante 8.00 R$ ");
            System.out.println("\n Digite o item 6 para suco de laranga 13.00 R$ ");
            System.out.println("\n");
            System.out.println("\nInforme o Item desejado: ");

            item = ler.nextInt();


            if (item == 1) {

                System.out.println("Digite a quantidade: ");
                quantidade = ler.nextInt();
                valor = (10.00 * quantidade);
                System.out.println("\n Produto : " + item);
                System.out.println("\n Valor total do produto: " + " R$" + valor);
            }

            // caso 2
            if (item == 2) {
                System.out.println("Digite a quantidade: ");
                quantidade = ler.nextInt();
                valor = (15.00 * quantidade);
                System.out.println("\n Produto : " + item);
                System.out.println("\n Valor total do produto: " + " R$" + valor);


            }

            // caso 3
            if (item == 3) {
                System.out.println("Digite a quantidade: ");
                quantidade = ler.nextInt();
                valor = (18.00 * quantidade);
                System.out.println("\n Produto : " + item);
                System.out.println("\n Valor total do produto: " + " R$" + valor);

                // caso 4
                if (item == 4) {
                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();
                    valor = (12.00 * quantidade);
                    System.out.println("\n Produto : " + item);
                    System.out.println("\n Valor total do produto: " + " R$" + valor);

                }

                // caso 5
                if (item == 5) {
                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();
                    valor = (8.00 * quantidade);
                    System.out.println("\n Produto : " + item);
                    System.out.println("\n Valor total do produto: " + valor + " R$" + valor);

                    // caso 6
                    if (item == 6) {
                        System.out.println("Digite a quantidade: ");
                        quantidade = ler.nextInt();
                        valor = (13.00 * quantidade);
                        System.out.println("\n Produto : " + item);
                        System.out.println("\n Valor total do produto: " + " R$" + valor);


                    }
                }
            }
        }

        //Exercicio 2

        public class Votar {

            public static void main(String[] args) {

                Scanner leia = new Scanner(System.in);

                int idade;


                System.out.println("digite sua idade ");
                idade = leia.nextInt();


                if (idade >= 65)
                    System.out.println("A pessoa esta apta a votar mas o voto È facultativo");
                else if (idade >= 18 && idade < 65)
                    System.out.println("A pessoa esta apta a votar e o voto È obrigatorio");
                else if (idade >= 16 && idade < 18)
                    System.out.println("A pessoa esta apta a votar mas o voto È facultativo");
                else if (idade < 16)
                    System.out.println("A pessoa nao esta apta a votar ");

                //Exercicio 3

            import java.util.Scanner;

                public class Salario {

                    public static void main(String[] args) {


                        float salario;
                        double imposto;


                        Scanner leia = new Scanner(System.in);

                        System.out.println("Digite seu salario para a verificacao de imposto de renda:");
                        salario = leia.nextFloat();

                        if (salario == 2000) {
                            System.out.println("voce È isento do imposto de renda ");
                        } else if (salario > 2000 && salario <= 3000) {
                            imposto = (0.08 * salario);
                            System.out.println("voce tem que pagar 8% de imposto de renda e o valor em imposto " + Math.round(imposto));
                        } else if (salario > 3000 && salario <= 4500) {
                            imposto = (0.18) * salario;
                            System.out.println("voce tem que pagar 18% de imposto de renda e o valor em imposto " + Math.round(imposto));
                        } else if (salario > 4500) {
                            imposto = (0.28) * salario;
                            System.out.println("voce tem que pagar 28% de imposto de renda e o valor em imposto " + Math.round(imposto));

                            // Exercicio 4

                            public class Exercicio1 {

                                public static void main(String[] args) {

                                    int n1, n2, n3;

                                    Scanner ler = new Scanner(System.in);


                                    System.out.println("digite um numero ");
                                    n1 = ler.nextInt();

                                    System.out.println("digite um numero ");
                                    n2 = ler.nextInt();

                                    System.out.println("digite um numero ");
                                    n3 = ler.nextInt();

                                    if (n1 + n2 == n3) {

                                        System.out.printf("A soma de N1 + N2 é igual que N3 \n %d + %d = %d = %d", n1,n2,(n1+n2),n3);
                                    } else if (n1 + n2 < n3) {

                                        System.out.printf("A soma de N1 + N2 é menor que N3\n %d + %d = %d < %d ", n1,n2,(n1+n2),n3);

                                    } else {
                                        System.out.printf("A soma de N1 + N2 é  maior que N3\n %d + %d = %d > %d ", n1,n2,(n1+n2),n3);