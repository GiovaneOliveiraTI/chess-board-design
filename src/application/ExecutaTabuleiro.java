package application;

import chess.Partida;

public class ExecutaTabuleiro {
    public static void main (String[] args) {

        Partida partida = new Partida();
        UI.imprimeTabuleiro(partida.getpecas());
    }
}

