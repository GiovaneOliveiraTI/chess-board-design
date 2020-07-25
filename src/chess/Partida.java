package chess;

        import boardGame.Posicao;
        import boardGame.Tabuleiro;
        import chess.pieces.Rei;
        import chess.pieces.Torre;

public class Partida {

    private Tabuleiro tabuleiro;

    public Partida() {
        tabuleiro = new Tabuleiro(8, 8);
        iniciarPartida();
    }

    public PecaXadrez[][] getpecas() {
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }

    private void iniciarPartida() {
        tabuleiro.movimentarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(10, 2));
        tabuleiro.movimentarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(1, 1));
        tabuleiro.movimentarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(3, 1));
    }
}

