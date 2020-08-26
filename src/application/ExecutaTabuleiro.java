package application;

import chess.Partida;
import chess.PecaXadrez;
import chess.PosicaoXadrez;
import chess.XadrezException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExecutaTabuleiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Partida partida = new Partida();
        List<PecaXadrez> capturadas = new ArrayList<>();

        while (true) {
            try {
                UI.limparTela();
                UI.imprimirPartida(partida, capturadas);
                System.out.println();
                System.out.print("Entre com a posição de origem: ");
                PosicaoXadrez origem = UI.lerPosicaoXadrez(sc);

                boolean[][] movimentosPossiveis = partida.MovimentosPosiveis(origem);
                UI.limparTela();
                UI.imprimeTabuleiro(partida.getpecas(), movimentosPossiveis);
                System.out.println();
                System.out.print("Entre com a posição de destino: ");
                PosicaoXadrez destino = UI.lerPosicaoXadrez(sc);
                PecaXadrez capturaPeca = partida.moverPecasXadrez(origem, destino);

                if (capturaPeca != null) {
                    capturadas.add(capturaPeca);
                }
            } catch (XadrezException | InputMismatchException e) {
                System.out.print(e.getMessage());
                sc.nextLine();
            }

        }
    }
}

