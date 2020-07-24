package application;

import chess.PecaXadrez;

public class UI {


    public static void imprimeTabuleiro(PecaXadrez[][] getpecas) {
        for (int i = 0; i<getpecas.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j<getpecas.length; j++) {
                imprimePeca(getpecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void imprimePeca (PecaXadrez peca) {
        if (peca == null) {
            System.out.print("_");
        } else {
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}
