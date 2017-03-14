package br.com.padroes.interpreter;

public class Numero implements Expressao {

  private int numero;

  public Numero(int numero) {
    this.numero = numero;
  }

  @Override
  public int avaliar() {
    return numero;
  }

  @Override
  public String aceitar(ImpressoraVisitor impressora) {
    return impressora.visitaNumero(this);
  }
  
}
