package chess;

import boardGame.Peca;
import boardGame.Posicao;
import boardGame.Tabuleiro;

public abstract class PecaXadrez extends Peca {

    private Cor cor;


    public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public PosicaoXadrez getPosicaoXadrez() {
        return PosicaoXadrez.fromPosition(posicao);
    }

    protected boolean existePecaOponente(Posicao posicao) {
        PecaXadrez  p = (PecaXadrez) getTabuleiro().peca(posicao);
        return p != null && p.getCor() != cor;
    }

}
