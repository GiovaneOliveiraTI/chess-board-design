package chess.pieces;

import boardGame.Tabuleiro;
import chess.Cor;
import chess.PecaXadrez;

public class Rei extends PecaXadrez {

    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
