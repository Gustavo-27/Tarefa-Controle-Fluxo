package pacote3;

import java.util.Scanner;

public class ControleDeFluxo {




            public static void main(String args[]) {
                Scanner s = new Scanner(System.in);
                System.out.println("Digite as notas do aluno");

                int num1 = (s.nextInt() + s.nextInt() + (s.nextInt() + s.nextInt()));
                int num2= num1 /4;
                System.out.println(num2);
                if (num2 >= 7) {
                    System.out.println("Aprovado");
                } else if (num2 >=5) {
                    System.out.println("Recuperação");
                } else if (num2 <=4)
                System.out.println("Reprovado");


            }
        }



