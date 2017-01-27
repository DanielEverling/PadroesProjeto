package br.com.padroes.strategy;

public class Icms implements Imposto {

  @Override
  public Double calcular(Orcamento orcamento) {
    return orcamento.getValor() * 0.1;
  }

}
