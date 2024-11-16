package combate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados do primeiro campeão
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vida1 = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque1 = sc.nextInt();
        System.out.print("Armadura: ");
        int armadura1 = sc.nextInt();
        sc.nextLine(); // Consumir quebra de linha

        // Criando o primeiro campeão
        Campeao campeao1 = new Campeao(nome1, vida1, ataque1, armadura1);

        // Dados do segundo campeão
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vida2 = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armadura2 = sc.nextInt();

        // Criando o segundo campeão
        Campeao campeao2 = new Campeao(nome2, vida2, ataque2, armadura2);

        // Quantidade de turnos
        System.out.print("Quantos turnos você deseja executar? ");
        int turnos = sc.nextInt();

        System.out.println();

        // Loop de combate
        for (int i = 1; i <= turnos; i++) {
            if (!campeao1.estaVivo() || !campeao2.estaVivo()) {
                break;
            }

            // Ambos atacam simultaneamente
            campeao1.takeDamage(campeao2.getAtaque());
            campeao2.takeDamage(campeao1.getAtaque());

            // Mostrar resultado do turno
            System.out.println("Resultado do turno " + i + ":");
            System.out.println(campeao1.status());
            System.out.println(campeao2.status());
            System.out.println();

            // Verificar se alguém morreu
            if (!campeao1.estaVivo() || !campeao2.estaVivo()) {
                break;
            }
        }

        System.out.println("### FIM DO COMBATE ###");

        sc.close();
    }
}
