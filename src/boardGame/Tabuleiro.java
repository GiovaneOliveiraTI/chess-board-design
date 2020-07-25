package boardGame;

public class Tabuleiro {

    private int linhas;

    private int colunas;

    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new TabuleiroException("Erro criando tabuleiro: é necessario que haja pelo menos 1 (uma) linha e 1 (uma) coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linha, int coluna) {
        if (!posicaoExistente(linha, coluna)) {
            throw new TabuleiroException("posição fora do tabuleiro. ");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroException("posição fora do tabuleiro. ");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void movimentarPeca(Peca peca, Posicao posicao) {
        if (exitePeca(posicao)) {
            throw new TabuleiroException("\n" +
                    "já existe uma peça na posição." + posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean posicaoExistente(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    public boolean posicaoExistente(Posicao posicao) {
        return posicaoExistente(posicao.getLinha(), posicao.getColuna());
    }

    public boolean exitePeca(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroException("posição fora do tabuleiro. ");
        }
        return peca(posicao) != null;
    }
}
