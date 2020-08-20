package application;

import chess.Partida;
import chess.PecaXadrez;
import chess.PosicaoXadrez;
import chess.XadrezException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecutaTabuleiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Partida partida = new Partida();

        while (true) {
            try {
                UI.limparTela();
                UI.imprimeTabuleiro(partida.getpecas());
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
            } catch (XadrezException e) {
                System.out.print(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.print(e.getMessage());
                sc.nextLine();
            }

        }
    }
}

