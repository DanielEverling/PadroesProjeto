package br.com.padroes.interpreter;

public class Soma implements Expressao {

  private Expressao esquerda;

  private Expressao direita;

  public Soma(Expressao esquerda, Expressao direita) {
    this.esquerda = esquerda;
    this.direita = direita;
  }

  @Override
  public int avaliar() {
    int valorEsquerda = esquerda.avaliar();
    int valorDireita = direita.avaliar();
    return valorEsquerda + valorDireita;
  }

}
