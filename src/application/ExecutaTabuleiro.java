package application;

import boardGame.Posicao;
import boardGame.Tabuleiro;
import chess.Partida;

public class ExecutaTabuleiro {
    public static void main (String[] args) {

        Partida partida = new Partida();
        UI.imprimeTabuleiro(partida.getpecas());
    }
}

