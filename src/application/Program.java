package application;

import entities.Aluguel;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];

        System.out.println("Bem vindo, quantas pessoas vão alugar o quarto? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Alguel #"+i+": ");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next().toLowerCase();
            System.out.println("Escolha um quarto de 1 a 10: ");
            int nq = sc.nextInt();
            while (vect[nq] != null){
                System.out.println("Quarto ocupado, Digite outro quarto: ");
                nq = sc.nextInt();
            }
            vect[nq] = new Aluguel(nome,email);
        }

        sc.nextLine();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null){
            System.out.println(vect[i]+","+" Quarto "+i);
    }

        }
        System.out.println("Tenha uma ótima hospedagem!");

    }
}

