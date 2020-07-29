package application;

import chess.Partida;
import chess.PecaXadrez;
import chess.PosicaoXadrez;

import java.util.Scanner;

public class ExecutaTabuleiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Partida partida = new Partida();

        while (true) {
            UI.imprimeTabuleiro(partida.getpecas());
            System.out.println();
            System.out.print("Entre com a posição de origem: ");
            PosicaoXadrez origem = UI.lerPosicaoXadrez(sc);

            System.out.println();
            System.out.print("Entre com a posição de destino: ");
            PosicaoXadrez destino = UI.lerPosicaoXadrez(sc);

            PecaXadrez capturaPeca = partida.moverPecasXadrez(origem, destino);

        }
    }
}

