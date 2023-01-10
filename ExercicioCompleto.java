package com.company;

import java.util.Scanner;

public class Salario1 {

    public static void main(String[] args) {

        float salario, abono, novo_salario;

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite o valor do salario ");
        salario = ler.nextFloat();

        System.out.println("Digite o valor do abono ");
        abono = ler.nextFloat();

        novo_salario = salario + abono;

        System.out.println("seu novo salario é " + novo_salario);

        public class Notas {

            public static void main(String[] args) {


                float nota1, nota2, nota3, nota4, media;

                Scanner ler = new Scanner(System.in);

                System.out.println("digite a nota1 " );
                nota1 = ler.nextFloat();

                System.out.println("Digite a nota2 " );
                nota2 = ler.nextFloat();

                System.out.println("Digite a nota3 " );
                nota3 = ler.nextFloat();

                System.out.println("Digite a nota3 " );
                nota3 = ler.nextFloat();

                System.out.println("Digite a nota4 " );
                nota4 = ler.nextFloat();

                media = (nota1+nota2+nota3+nota4)/4;
                System.out.println(media);

                import java.util.Scanner;

                public class SalarioBruto {

                    public static void main(String[] args) {

                        float salarioBrutof,adcNoturnof,HorasExtrasf,Descontosf,SalarioLiquidof;

                        Scanner ler = new Scanner(System.in);
                        System.out.println("Informe salario bruto ");
                        salarioBrutof = ler.nextFloat();

                        System.out.println("Informe adicional noturno ");
                        adcNoturnof = ler.nextFloat();

                        System.out.println("Informe Horas Extras ");
                        HorasExtrasf = ler.nextFloat();

                        System.out.println("Informe Descontos ");
                        Descontosf = ler.nextFloat();

                        SalarioLiquidof =  (salarioBrutof + adcNoturnof + (HorasExtrasf * 5) - Descontosf);

                        System.out.println("Seu Salario Liquido é " + SalarioLiquidof);

                        float num1, num2, num3, num4, diferenca;

                        Scanner ler = new Scanner(System.in);

                        System.out.println("digite o primeiro numero ");
                        num1 = ler.nextFloat();

                        System.out.println("digite o segundo numero ");
                        num2 = ler.nextFloat();

                        System.out.println("digite o terceiro numero ");
                        num3 = ler.nextFloat();

                        System.out.println("digite o quarto numero ");
                        num4 = ler.nextFloat();

                        diferenca = ((num1 * num2) - (num3 * num4));

                        System.out.println("a diferenca do produto é " + diferenca);

    }
}