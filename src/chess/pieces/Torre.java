package chess.pieces;

import boardGame.Posicao;
import boardGame.Tabuleiro;
import chess.Cor;
import chess.PecaXadrez;

public class Torre extends PecaXadrez {

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "T";
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        Posicao p = new Posicao(0, 0);

        //verificação de movimentação de peças para cima
        p.setValues(posicao.getLinha() - 1, posicao.getColuna());
        while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().existePeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() - 1);
            if (getTabuleiro().posicaoExistente(p) && existePecaOponente(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
        }


        //verificação de movimentação de peças lado Esquerdo
        p.setValues(posicao.getLinha(), posicao.getColuna() - 1);
        while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().existePeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() - 1);
            if (getTabuleiro().posicaoExistente(p) && existePecaOponente(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
        }

        //verificação de movimentação de peças lado Direito
        p.setValues(posicao.getLinha(), posicao.getColuna() + 1);
        while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().existePeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() + 1);
            if (getTabuleiro().posicaoExistente(p) && existePecaOponente(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
        }

        //verificação de movimentação de peças para baixo
        p.setValues(posicao.getLinha() + 1, posicao.getColuna());
        while (getTabuleiro().posicaoExistente(p) && !getTabuleiro().existePeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() + 1);
            if (getTabuleiro().posicaoExistente(p) && existePecaOponente(p)) {
                mat[p.getLinha()][p.getColuna()] = true;
            }
        }

        return mat;
    }
}
