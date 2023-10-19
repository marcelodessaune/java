package teste2;

import java.util.Random;
import java.util.Scanner;

public class Guerreiro {
    private String nome;
    private int qtdVidas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int setVidas() {
        Random rand = new Random();
        qtdVidas = rand.nextInt(4) + 9;
        return qtdVidas;
    }

    public String prologoIntroducao() {
        return "Bem-vindo, Guerreiro " + nome + "! Você começa com " + qtdVidas + " vidas.";
    }

    public String vidaExtra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Você deseja uma vida extra? (Sim ou Não): ");
        String pedidoMisericordia = scanner.nextLine();
        return pedidoMisericordia;
    }

    public boolean decidirVidaExtra(String pedidoMisericordia) {
        return pedidoMisericordia.trim().split(" ").length > 5;
    }
}
