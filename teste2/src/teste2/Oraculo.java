package teste2;

import java.util.Random;
import java.util.Scanner;

public class Oraculo {
    private String nome;
    private Guerreiro warrior;
    private String prologoIntroducao;
    private String prologoPerdedor;
    private String prologoVencedor;

    public Oraculo(String nome) {
        this.nome = nome;
        this.warrior = new Guerreiro();
        warrior.setNome(nome);
        int vidas = warrior.setVidas();
        this.prologoIntroducao = warrior.prologoIntroducao();
        this.prologoPerdedor = "Você perdeu, Guerreiro " + nome + "!";
        this.prologoVencedor = "Você venceu, Guerreiro " + nome + "!";
    }

    public void jogarPartida() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prologoIntroducao);

        int numeroSecreto = new Random().nextInt(100) + 1;
        int vidas = warrior.setVidas();
        int adivinha;
        boolean adivinhou = false;

        while (vidas > 0) {
            System.out.print("Adivinhe o número (1-100): ");
            adivinha = scanner.nextInt();
            scanner.nextLine();

            if (adivinha == numeroSecreto) {
                adivinhou = true;
                break;
            } else if (adivinha < numeroSecreto) {
                System.out.println("Segredo é MAIOR!");
            } else {
                System.out.println("Segredo é MENOR!");
            }
            vidas--;
        }

        if (adivinhou) {
            System.out.println("Você adivinhou o segredo! Vamos jogar o próximo nível.");
            int opcao = new Random().nextInt(2);
            int soma = new Random().nextInt(6) + new Random().nextInt(6);

            System.out.print("Escolha PAR (0) ou ÍMPAR (1): ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if ((soma % 2 == 0 && escolha == 0) || (soma % 2 == 1 && escolha == 1)) {
                System.out.println("Você ganhou! " + soma + " é " + (escolha == 0 ? "PAR" : "ÍMPAR"));
                System.out.println(prologoVencedor);
            } else {
                System.out.println("Você perdeu! " + soma + " é " + (escolha == 0 ? "PAR" : "ÍMPAR"));
                System.out.println(prologoPerdedor);
            }
        } else {
            System.out.println("Você ficou sem vidas. " + prologoPerdedor);
        }

        String pedidoMisericordia = warrior.vidaExtra();
        if (warrior.decidirVidaExtra(pedidoMisericordia)) {
            vidas++;
            System.out.println("Você recebeu uma vida extra. Agora você tem " + vidas + " vidas.");
        }

        if (vidas <= 0) {
            System.out.println("Você está fora do jogo. " + prologoPerdedor);
        }
    }
}
