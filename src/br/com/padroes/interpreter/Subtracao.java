package br.com.padroes.interpreter;

public class Subtracao implements Expressao {

  private Expressao esquerda;

  private Expressao direita;

  public Subtracao(Expressao esquerda, Expressao direita) {
    this.esquerda = esquerda;
    this.direita = direita;
  }

  @Override
  public int avaliar() {
    int valorEsquerda = esquerda.avaliar();
    int valorDireita = direita.avaliar();
    return valorEsquerda + -valorDireita;
  }

  @Override
  public String aceitar(ImpressoraVisitor impressora) {
    return impressora.visitaSubstracao(this);
  }

  public Expressao getEsquerda() {
    return esquerda;
  }

  public Expressao getDireita() {
    return direita;
  }

}
